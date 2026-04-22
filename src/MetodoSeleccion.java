public class MetodoSeleccion {
    
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n -1; i ++){
            int indiceDelMenor = i;
            for( int j = i+1; j < n; j++){
                if (arr[indiceDelMenor] > arr [j]){
                    indiceDelMenor = j; 

                }
            }
            if (i !=indiceDelMenor){//Intercambio
                int aux = arr [i];
                arr[i] = arr[indiceDelMenor];
                arr[indiceDelMenor] = aux;

            }
        }

        
    }

    public void printArreglo(int[] arr) {


    }

    public void sortDes(int[] arr) {
        int n = arr.length;
        for (int i = 0; i > n -1; i ++){
            int indiceDelMayor = i;
            for( int j = i+1; j > n; j++){
                if (arr[indiceDelMayor] > arr [j]){
                    indiceDelMayor = j; 

        
    }
    }
}
    }
}
