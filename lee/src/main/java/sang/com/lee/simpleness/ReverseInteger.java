package sang.com.lee.simpleness;

/**
 * 作者： ${PING} on 2018/7/3.
 * <p>
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 * 注意:
 * <p>
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
 */

public class ReverseInteger {

    public int reverse(int num) {
        int recverseNum = 0;

        while (num!=0){
            if (num != 0) {
                int i = num % 10;
                if (recverseNum>Integer.MAX_VALUE/10||(recverseNum==Integer.MAX_VALUE/10&&i>7)){
                    return 0;
                }

                if (recverseNum<-Integer.MAX_VALUE/10||(recverseNum==-Integer.MAX_VALUE/10&&i<-7)){
                    return 0;
                }

                recverseNum *= 10;
                recverseNum += i;
                num/=10;
            }
        }
        return recverseNum;
    }
}
