import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Data {
    private Map<String, Register> registers = new HashMap<String,Register>();
    private Stack<Register> stack = new Stack<Register>();
    Register eax = new Register();
    Register ebx = new Register();
    Register ecx = new Register();
    Register edx = new Register();

    Data() {
        registers.put("%eax",eax);
        registers.put("%ebx",ebx);
        registers.put("%ecx",ecx);
        registers.put("%edx",edx);
    }

    public Register getRegister(String reg) {
        return this.registers.get(reg);
    }

    public void setRegister(String reg, Integer val) {
        Register v = new Register();
        v.setValue(val);
        v.setKnown(true);
        //System.out.println(val + " do " + reg);
        if(registers.containsKey(reg)){
            registers.put(reg, v);
           //System.out.println("Wrzucono do " + reg + " wartosc: " + val);
        } else {
            //System.out.println("Error");
        }
    }

    public void push(Integer val) {
        Register n = new Register();
        n.setValue(val);
        n.setKnown(true);
        stack.push(n);
        //System.out.println("Wrzucono na stosik: " + n.getValue());
    }

    public Integer pop() {
        return stack.pop().getValue();
    }

    public boolean stackEmpty() {
        return stack.empty();
    }

}
