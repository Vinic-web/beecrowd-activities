using System;
using static System.Console;
using System.Linq;

class URI
{
    static void Main(string[] args)
    {
        int[] valoresArray = ReadLine().Split().Select(int.Parse).ToArray();

        int init = valoresArray[0];
        int end = valoresArray[1];

        if (init == end)
        {
            WriteLine("O JOGO DUROU 24 HORA(S)");
        }
        else if (init > end)
        {
            WriteLine($"O JOGO DUROU {Math.Abs((init - end) - 24)} HORA(S)");
        }
        else
        {
            WriteLine($"O JOGO DUROU {end-init} HORA(S)");
        }
    }
}