package sameExample.command;

import sameExample.metier.ServiceEndPoint;

public class CommandGetInfo implements Command {

    private ServiceEndPoint service;
    private String info;

    public CommandGetInfo(ServiceEndPoint service) {
        this.service = service;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        info = service.getInfo();
    }

    public String getResponce() {
        return info;
    }

}
