public class Main {
        public static void main(String[] args){
            double[] array = new double[10];
            array[0] = 2.900;
            array[1] = 1.400;
            array[2] = 5.300;
            array[3] = 7.000;
            array[4] = 1.520;
            array[5] = 1.750;
            array[6] = 3.500;
            array[7] = 7.200;
            array[8] = 2.300;
            array[9] = 1.450;
            double[] sortedArray = insertionSort(array);
            System.out.println("Відсортований список масси автомобілів на парковці автосалону: ");
            for (int i = 0; i < sortedArray.length; i++){
                System.out.println("- " + sortedArray[i] + "; ");
            }

        }
        public static double[] insertionSort(double[] array) {
            for (int i = 1; i < array.length; i++) {
                double newValue = array[i];
                int j = i;
                while (j > 0 && array[j - 1] > newValue) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = newValue;
            }
            return array;
        }
}