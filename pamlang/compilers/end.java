package pamlang.compilers;
import pamlang.*;
public class end implements compilerInterface {
    public String compile(String command) {
        command = "}";
        return command;
    }
}