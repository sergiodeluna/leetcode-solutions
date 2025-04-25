package easy;

public class BinarySearch {

    public int search(int[] nums, int target) {
        int left = 0; // Primeira posição do array
        int right = nums.length - 1; // Última posição do array

        while (left <= right) {
            // Calcula o meio do array (forma segura contra 'overflow')
            int mid = left + (right - left) / 2;

            // Se o elemento do meio for igual ao alvo, retorna o índice
            if (nums[mid] == target) {
                return mid;
            }
            // Se o elemento do meio for menor que o alvo, significa que o alvo está na metade *direita* do array
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            // Se o elemento do meio for maior que o alvo, significa que o alvo está na metade *esquerda* do array
            else {
                right = mid - 1;
            }
        }

        // Se sair do ‘loop’, o alvo não foi encontrado
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int result = binarySearch.search(nums, target);
        System.out.println("Resultado: " + result); // Esperado: 4
    }
}