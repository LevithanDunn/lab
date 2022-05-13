import cn.hutool.core.util.IdUtil;

/**
 * @author dunn
 * @create 2022-05-13 18:40
 */
public class TestA {
    public static void main(String[] args) {
        //方法2：从Hutool-4.1.14开始提供
        String id2 = IdUtil.objectId();
        int x = 1;
        System.out.println("id2 = " + id2);
        System.out.println("Aaaa");
    }
}
