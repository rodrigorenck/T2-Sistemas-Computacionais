public class E2 {

    public static void main(String[] args){
        int[] nums = {5, 2, -2, -7, 3, 14, 10, -3, 9, -6, 4, 1};
        int maxSoma = Integer.MIN_VALUE;
        int soma = 0; int i = 0; int j = 0;
        int ini = 0; int fim = 0;
        for (i = 0; i < nums.length; i++){
            soma = 0;
            for (j = i; j < nums.length; j++){
                soma = soma + nums[j];
                if (soma > maxSoma){
                    maxSoma = soma;
                    ini = i;
                    fim = j;
                }
            }
        }
        System.out.printf("Soma maxima: %d, de %d ate %d.", maxSoma, ini, fim);
    }
}