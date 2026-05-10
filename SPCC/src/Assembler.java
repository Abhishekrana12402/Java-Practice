import java.util.HashMap;
import java.util.Map;

public class Assembler {
    // Machine Operation Table (MOT)
    private static final Map<String, Integer> MOT = new HashMap<>();
    static {
        MOT.put("MOV", 1);
        MOT.put("ADD", 2);
        MOT.put("SUB", 3);
        // Add more instructions as needed
    }

    // Pseudo Operation Table (POT)
    private static final Map<String, Integer> POT = new HashMap<>();
    static {
        POT.put("START", 1);
        POT.put("END", 2);
        POT.put("DC", 3);
        POT.put("DS", 4);
        // Add more pseudo-operations as needed
    }

    // Symbol Table (ST)
    private static final Map<String, Integer> ST = new HashMap<>();

    // Assemble function

    // Assemble function
    // Assemble function
    // Assemble function
    public static String assemble(String[] instructions) {
        StringBuilder machineCode = new StringBuilder();

        for (String instruction : instructions) {
            String[] parts = instruction.split("\\s+", 2);
            String mnemonic = parts[0];
            String operand = parts.length > 1 ? parts[1] : null;

            if (MOT.containsKey(mnemonic)) {
                machineCode.append(MOT.get(mnemonic));
                if (operand != null) {
                    String[] operands = operand.split(",\\s*"); // Split operands by comma
                    for (String op : operands) {
                        if (ST.containsKey(op)) {
                            // Operand is a label, append its address
                            machineCode.append(" ").append(ST.get(op));
                        } else {
                            // Operand is a numeric value, parse it
                            machineCode.append(" ").append(op);
                        }
                    }
                }
            } else if (POT.containsKey(mnemonic)) {
                switch (POT.get(mnemonic)) {
                    case 1: // START
                        machineCode.append("START");
                        break;
                    case 2: // END
                        machineCode.append("END");
                        break;
                    case 3: // DC
                        machineCode.append("DC ").append(operand).append(" ");
                        break;
                    case 4: // DS
                        machineCode.append("DS ").append(operand).append(" ");
                        break;
                    default:
                        break;
                }
            } else {
                // Assuming it's a label
                ST.put(mnemonic, machineCode.length());
            }
        }

        return machineCode.toString();
    }





    public static void main(String[] args) {
        String[] instructions = {
                "START",
                "A DC 10",
                "B DS 1",
                "MOV A, B",
                "END"
        };

        String machineCode = assemble(instructions);
        System.out.println("Machine Code: " + machineCode);
    }
}
