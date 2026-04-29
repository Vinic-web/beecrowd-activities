using System;
using static System.Console;
using System.Linq;

class URI
{
    static void Main(string[] args)
    {
        int[] numeros = ReadLine().Split(' ').Select(int.Parse).ToArray();
        Array.Sort(numeros);
        if (numeros[1] % numeros[0] == 0) {
            WriteLine("Sao Multiplos");
        }
        else
        {
            WriteLine("Nao sao Multiplos");
        }
    }
}