package chapter01.section02;

/**
 * @author: deng
 * @datetime: 2020/6/4 11:02 上午
 * @desc: 时间复杂度
 */
public class TimeComplex {
    /**
     * 给小灰1个长度为10cm的面包，小灰每3分钟吃掉1cm，那么吃掉整个面包需要多久？
     * T(n) = 3n
     *
     * @param n 面包长度
     */
    void eat1(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("等待一分钟");
            System.out.println("等待一分钟");
            System.out.println("吃一cm面包");
        }
    }

    /**
     * 给小灰1个长度为16cm的面包，小灰每5分钟吃掉面包剩余长度的一半，
     * 即第5分钟吃掉8cm，第10分钟吃掉4cm，第15分钟吃掉2cm……那么小灰把面包吃得
     * 只剩1cm，需要多久呢
     * T(n) = 5logn
     *
     * @param n 面包长度
     */
    void eat2(int n) {
        for (int i = n; i > 1; i /= 2) {
            System.out.println("等待一分钟");
            System.out.println("等待一分钟");
            System.out.println("等待一分钟");
            System.out.println("等待一分钟");
            System.out.println("吃一半面包");
        }
    }

    /**
     * 给小灰1个长度为10cm的面包和1个鸡腿，小灰每2分钟吃掉1个鸡腿。
     * 那么小灰吃掉整个鸡腿需要多久呢
     * T(n)=2
     *
     * @param n 面包长度
     */
    void eat3(int n) {
        System.out.println("等待一分钟");
        System.out.println("吃一个鸡腿");
    }

    /**
     * 给小灰1个长度为10cm的面包，小灰吃掉第1个1cm需要1分钟时间，吃
     * 掉第2个1cm需要2分钟时间，吃掉第3个1cm需要3分钟时间……每吃1cm所花的时间就
     * 比吃上一个1cm多用1分钟。 那么小灰吃掉整个面包需要多久呢
     * T(n) = (n² + n)/2
     * 忽略
     * @param n 面包长度
     */
    void eat4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("等待一天");
            }
            System.out.println("吃一寸面包");
        }
    }
}
