/* Реализуйте сущность “Deque” с помощью массива Integer, массив ограничен в размере size <=5 . Нужно реализовать методы:
boolean offerFirst(Integer element); //добавляет элемент element в самое начало массива. Если элемент удачно добавлен, 
возвращает true, иначе - false
boolean offerLast(Integer element); //добавляет элемент element в конец массива. Если элемент удачно добавлен, 
возвращает true, иначе - false
Integer peekFirst(); //возвращает без удаления элемент из начала массива. Если массив пуст, возвращает значение null
Integer peekLast(); //возвращает без удаления последний элемент массива. Если массив пуст, возвращает значение null
Integer pollFirst(); //возвращает с удалением элемент из начала массива. Если массив пуст, возвращает значение null
Integer pollLast(); //возвращает с удалением последний элемент массива. Если массив пуст, возвращает значение null */

public class task_1dz {

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5};

        System.out.println(offerFirst(nums, 0));
        System.out.println(offerLast(nums, 6));
        System.out.println(peekFirst(nums));
        System.out.println(peekLast(nums));
        System.out.println(pollFirst(nums));
        System.out.println(pollLast(nums));
    }
    
    private static boolean offerFirst(int[] nums, int element) {
        int[] numsRes = new int[nums.length + 1];
        for(int i = 1; i < numsRes.length; i++) {
            numsRes[i] = nums[i - 1];
        }
        numsRes[0] = element;
        for (int item : numsRes) System.out.print(item + "; ");
        if(numsRes[0] == element) return true;
        else return false;
        
    }

    private static boolean offerLast(int[] nums, int element) {
        int[] numsRes = new int[nums.length + 1];
        for(int i = 0 ; i < nums.length; i++) {
            numsRes[i] = nums[i];
        }
        numsRes[numsRes.length - 1] = element;
        for (int item : numsRes) System.out.print(item + "; ");
        if(numsRes[numsRes.length - 1] == element) return true;
        else return false;
    }

    private static Integer peekFirst(int[] nums) {
        try {
            int first = nums[0];
            return first;
        } catch (Exception e) {    
            return null;
        }
    }

    private static Integer peekLast(int[] nums) {
        try {
            int last = nums[nums.length - 1];
            return last;
        } catch (Exception e) {
            return null;
        }

    }

    private static Integer pollFirst(int[] nums) {
        try {
            int first = nums[0];
            int[] numsRes = new int[nums.length - 1];
            for(int i = 0; i < numsRes.length; i++) numsRes[i] = nums[i + 1];
            for (int item : numsRes) System.out.print(item + "; ");
            System.out.print("first = ");
            return first;
        } catch (Exception e) {
            return null;
        }
    }

    private static Integer pollLast(int[] nums) {
        try {
            int last = nums[nums.length - 1];
            int[] numsRes = new int[nums.length - 1];
            for(int i = 0; i < numsRes.length; i++) numsRes[i] = nums[i];
            for (int item : numsRes) System.out.print(item + "; ");
            System.out.print("last = ");
            return last;
        } catch (Exception e) {
            return null;
        }
    }
}