using System;
using static System.Console;

class URI
{
    static void Main(string[] args)
    {
        int a = Convert.ToInt32(ReadLine());

        for (int i = 1; i <= a; i++)
        {
            WriteLine($"{i} {i * i} {i * i * i}");
            WriteLine($"{i} {i * i + 1} {i * i * i + 1}");
        }
    }
}