using System;
using static System.Console;

class URI
{

    static void Main(string[] args)
    {
        int qtd_testes, qtd_testadas, f1, f2, resto;

        //Quantidade de testes
        qtd_testes = Convert.ToInt32(ReadLine());

        qtd_testadas = 0;

        while (qtd_testadas < qtd_testes)
        {
            string valores = ReadLine();
            string[] strValores = valores.Split(' ');

            f1 = Convert.ToInt32(strValores[0]);
            f2 = Convert.ToInt32(strValores[1]);
            do
                {
                    resto = f1 % f2;
                    if (resto == 0)
                    {
                        WriteLine(f2);
                    }
                    else
                    {
                        f1 = f2;
                        f2 = resto;

                    }
                } while (resto != 0);
            qtd_testadas++;
        }
    }
}