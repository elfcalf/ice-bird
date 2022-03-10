/* 方法的细节
 访问修饰符：控制方法的使用范围（public,protected,private,final）
*/


 public class MethodDetail{
 	public static void main(String[] args){
 		AA a = new AA();
 		int [] res = a.getSumAndSub(1, 4);
 		System.out.println("和=" + res[0]);
 		System.out.println("差=" + res[1]);
 	}
 }

 //采用数组类型定义类

 class AA{
 	//1.一个方法最多只能有一个返回值，如何返回多个结果？采用数组
 	public int[] getSumAndSub(int n1, int n2){
 		int[] resArr = new int[2];
 		resArr[0] = n1 + n2;
 		resArr[1] = n1 - n2;
 		return resArr;
 	}
 	//2.返回语句return的使用，如果方法要求有返回数据类型，则方法体中最后的执行语句必须为return值
    //而且要求返回值类型必须和return的值类型一致或兼容
	public int f1(){
	 	int d1 = 1 * 3;
 		return d1;  //此时类型一致，如果d1是double,则不可，是short也可以，因为兼容
 }//如果方法是void，则return可写可不写
 	//3.同一个类中的方法可以直接调用
 	public void sayok(){
 		f1();
 	}
 	//4.可以跨类调用方法
 	
 }


