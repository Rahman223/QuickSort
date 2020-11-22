class QuickSortTest {
    public static void main (String [] args){ 
        int [] array = {4,2,1,6,3};
        displayArray(array);
        quickSort2(array, 0, array.length-1);
        displayArray(array);
    }

public static int partition (int [] array, int l, int h){
    int pivot = array[l];
    int i =l; 
    int j=h;

    while (i<j){
    do {
        i++;
    }while (array[i]<=pivot);
    
    do{
        j--;
    }while (array[j]>pivot);

    if(i<j){
    swap(array, i, j);
    }
    
}
swap(array, l, j);
return j;
    
}

public static void quickSort (int [] array, int l, int h ){
    if (l<h){
        int j = partition(array, l, h);
        quickSort(array, l, j);
        quickSort(array, j+1, h);
    }
}

public static int partition2 (int [] array, int l , int h){
    int i = l-1;
    int j= l; 
    int pivot = array[h];
    while (j<h){
    if(array[j]<= pivot){
        i++;
        swap(array,i,j);
        j++;
    }else {
        j++;
    }
}
swap(array,i+1,h);
return i+1;

}

public static void quickSort2 (int [] array, int l, int h){
    if (l<h){
    int p = partition2(array, l, h);
    quickSort2(array, l, p-1);
    quickSort2(array, p+1, h);
    }
}


public static void swap (int [] array, int i, int j){
    int temp = array [i];
    array[i]= array[j];
    array[j]= temp;
}

public static void displayArray (int [] array){
    for (int i=0; i<array.length; i++){
        System.out.print(array[i]+"\t");
    }
    System.out.println();
}
}