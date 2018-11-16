package com.geekluxun.headfirst.command.party;

public class LightOnCommand implements Command {
    /**
     * 这是命令的接受者，真正执行命令的对象
     */
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
