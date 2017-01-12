/**
 * Created by Administrator on 2017/1/9.
 */
public class IntArraySearcher {
    private Sorter sorter;
    public IntArraySearcher(Sorter sorter) {
        this.sorter = sorter;
    }
    public boolean contains(int[] array, int element) {
        sorter.sort(array);
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

