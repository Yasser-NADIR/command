package sameExample.command;

import sameExample.metier.ServiceEndPoint;

public class CommandSendInfo implements Command {

    private ServiceEndPoint service;
    private String arg1;
    private int arg2;

    public CommandSendInfo(ServiceEndPoint service) {
        this.service = service;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        service.traitementDonnée(arg1, arg2);
    }

    public void setArg1(String arg1) {
        this.arg1 = arg1;
    }

    public void setArg2(int arg2) {
        this.arg2 = arg2;
    }

}
