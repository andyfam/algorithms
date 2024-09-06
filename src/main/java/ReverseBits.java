import java.util.Stack;

public class ReverseBits {
    // you need treat n as an unsigned value
    public int stack(int n) {
        String bits = Integer.toBinaryString(n);
        bits = String.format("%32s", bits).replace(" ", "0");

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < bits.length(); i++) {
            stack.push(bits.charAt(i));
        }

        String bitsReserve = "";
        while (!stack.isEmpty()) {
            bitsReserve += stack.pop();
        }

        int result = Integer.parseUnsignedInt(bitsReserve, 2);
        return result;
    }

    /*
    break the 32 bits into half(16 - 16 each) and right shift 1st half part to 16 positions and left shift the 2nd half to 16 positions
    break the 16 bits into half(8 - 8 each) and right shift to 8 positions and left shift to 8 positions
    break the 8 bits into half(4 - 4 each) and right shift to 4 positions and left shift to 4 positions
    break the 4 bits into half(2 - 2 each) and right shift to 2 positions and left shift to 2 positions
    break the 2 bits into half(1 - 1 each) and right shift to 1 positions and left shift to 1 positions
    */
    public int MastAndShift(int n){
        n = ((n & 0b11111111111111110000000000000000) >>> 16) | ((n & 0b00000000000000001111111111111111) << 16);
        n = ((n & 0b11111111000000001111111100000000) >>> 8)  | ((n & 0b00000000111111110000000011111111) << 8);
        n = ((n & 0b11110000111100001111000011110000) >>> 4)  | ((n & 0b00001111000011110000111100001111) << 4);
        n = ((n & 0b11001100110011001100110011001100) >>> 2)  | ((n & 0b00110011001100110011001100110011) << 2);
        n = ((n & 0b10101010101010101010101010101010) >>> 1)  | ((n & 0b01010101010101010101010101010101) << 1);
        return n;
    }
}
