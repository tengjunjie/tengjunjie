public class ot {
    public static void main(String[] args) {
        int[] num = {3,2,1,5};//随便定义一组数据的数组

        int tem; //定义一个变量用于交换的临时数据

        //控制轮数，对比轮数为：数组元素个数-1

        for(int i=0;i<num.length-1;i++){

            //控制次数，每一轮需要对比的次数为：数组元素个数-当前轮数-1

            for(int j=0;j<num.length-1-i;j++){

                //两个数比较大小，交换位置

                if(num[j]<num[j+1]){

                    tem = num[j];

                    num[j]=num[j+1];

                    num[j+1]=tem;

                }

            }

        }
        System.out.println("使用冒泡排序后的数列是：");

        for(int i=0;i<num.length;i++){

            System.out.println(num[i]+" ");

        }

    }

}
