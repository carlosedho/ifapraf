/*
The MIT License (MIT)
Copyright (c) 2022 Carlos Eduardo <cduhno@gmail.com>
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package ifapraf;
import java.util.Scanner;
public class IfAPraF {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            char letra;
            System.out.println("Informe a letra (entre A e F): ");
            letra = in.next().chatAt(0);
            if (letra == 'a') {
                System.out.println("Você inseriu a letra "A"");
            }
            else if (letra == 'b') {
                System.out.println("Você inseriu a letra "B"");
            }
            else if (letra == 'c') {
                System.out.println("Você inseriu a letra "C"");
            }
            else if (letra == 'd') {
                System.out.println("Você inseriu a letra "D"");
            }
            else if (letra == 'e') {
                System.out.println("Você inseriu a letra "E"");
            }
            else if (letra == 'f') {
                System.out.println("Você inseriu a letra "F"");
            }
    }
}