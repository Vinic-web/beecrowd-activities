using System;
using static System.Console;

class URI
{
    static void Main(string[] args)
    {
        int linhas = Convert.ToInt32(ReadLine());
        int num = 1;

        for (int i = 1; i <= linhas; i++)
        {
            WriteLine($"{num} {num + 1} {num + 2} PUM");
            num = num + 4 ;
        }
        ReadKey();
    }
}