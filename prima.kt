//2,3,5,dst
/*Aturan Prima, Jika bilangan dimodulus bilangan 2,3,5 sisanya 0,
maka itu bukan bilangan prima*/

//Contoh Bilangan Prima
//7%2=1
//7%3=1
//7%5=2
//Termasuk Bilangan Prima, karena tidak ada satu pun hasil modulus 0

//Contoh Bilangan Bukan Prima
//8%2=0
//8%3=2
//8%5=3
//Terdapat salah satu yang dimodulus menghasilkan angka 0 maka bukan bilangan prima

fun main(args: Array<String>) {
    print("Masukkan Bilangan :")
    val bilangan =readLine()!!.toInt()

    if(bilangan>=2){
        if((bilangan==2)||(bilangan==3)||(bilangan==5)){
            print("Bilangan Prima")
        }else{
            if((bilangan%2==0)||(bilangan%3==0)||(bilangan%5==0)){
                print("Bukan Bilangan Prima")
            }else{
                print("Bilangan Prima")
            }
        }
    }else{
        print("Bukan Bilangan Prima")
    }
}