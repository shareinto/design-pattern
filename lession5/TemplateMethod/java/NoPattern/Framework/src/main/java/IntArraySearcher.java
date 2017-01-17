import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Administrator on 2016/12/18.
 */
public class IntArraySearcher {

    private AscBubbleSorter ascBubbleSorter;
    public IntArraySearcher(AscBubbleSorter ascBubbleSorter) {
        this.ascBubbleSorter = ascBubbleSorter;
    }

    public boolean contains(int[] array, int element) {
        this.ascBubbleSorter.sort(array);
        return binarySearch(array, element) > -1;
    }

    private int binarySearch(int[] srcArray, int des) {
        //��һ��λ��.
        int low = 0;
        //���λ��.���鳤��-1,��Ϊ�±��Ǵ�0��ʼ��.
        int high = srcArray.length - 1;
        //��low"ָ��"��high���ظ���ʱ��.
        while (low <= high) {
            //�м�λ�ü���,low+ ���λ�ü�ȥ���λ��,����һλ,�൱�ڳ�2.Ҳ������(high+low)/2
            int middle = low + ((high - low) >> 1);
            //�����м�����ֽ����ж�,�Ƿ����,��ȵĻ��ͷ��ض�Ӧ�������±�.
            if (des == srcArray[middle]) {
                return middle;
                //���С�ڵĻ����ƶ���߲��"ָ��"
            } else if (des < srcArray[middle]) {
                high = middle - 1;
                //�ƶ���͵�"ָ��"
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }
}
