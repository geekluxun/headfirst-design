package com.geekluxun.headfirst.command.party;

public interface Command {
    public void execute();

    public void undo();
}
