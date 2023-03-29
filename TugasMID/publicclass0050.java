/*NIM		: 13020210050
Nama		: Miftahul Jannah
Hari/Tanggal: Rabu, 08 Maret 2021*/

interface A{ public void aaa(); }
interface B extends A{
    public void aaa();
}
class implements A,B{
    public void aaa(){
        System.out.println("aaa");
    }
    public void main(String[] arg){
        System.out.println("main");
        this.aaa();
    }
}