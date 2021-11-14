class Test {
    public static void main(String[] args) {
        Ihminen jokke = new Ihminen("Jokke");
        Ihminen makke = new Ihminen("Makke");

        makke.juo();
        jokke.juo();
        makke.lisaanny();
        jokke.lisaanny();
        makke.syo();
        jokke.syo();
        makke.nuku();
        jokke.nuku();
        makke.tulostaTiedot();
        jokke.tulostaTiedot();

        Ohjelmoija juppe = new Ohjelmoija("Juppe", 3000);

        System.out.println("Ohjelmoijan " + juppe.getName() + " palkka on " + juppe.getPalkka() + " euroa kuussa.");
        juppe.ohjelmoi();
        juppe.juo();
        juppe.osallistuCyberGothDanceJuhlaan();
        juppe.syo();
        juppe.lisaanny();
        juppe.nuku();
        juppe.tulostaTiedot();
    }
}