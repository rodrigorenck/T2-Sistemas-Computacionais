/**
 * Escreva um programa que conta o n´umero de palavras armazenadas em uma string e apresenta o total no terminal. Como sugestao,
 * utilize a funcao abaixo como referencia para sua implementacao, a ser chamada a partir do programa principal. Utilize duas strings na demonstracao
 * do funcionamento.
 */
public class E1 {

    public static int countWords(char[] str, int size) {
        int i = 0, words = 0;

        while (true) {
            while ((str[i] < 33) || (str[i] > 126)) {
                if (i >= size) {
                    return words;
                }
                i++;
            }
            while ((str[i] > 32) && (str[i] < 127)) {
                if(i>= size){
                    return words + 1;
                }
                i++;
            }
            words++;
        }
    }


    public static void main(String[] args) {
        char[] words = {'l', 'a', 'u', ' ', 'e', 'x', 'q'};
        int result = countWords(words, 6);
        System.out.println(result);
    }
}
