import java.util.Scanner;
public class Rutika {
    int nombreRutika;
    int niveauRutika;

    public Rutika (int nombreDeRutika, int niveauRutika){
        this.nombreRutika = nombreDeRutika;
        this.niveauRutika = niveauRutika;
    }

    public Rutika() {

    }


    public void CreationRutika(int nombreRutika){
        for (int i = 1; i <= nombreRutika; i++){
            System.out.println("Niveau du rutika ? :");
            Scanner scanner = new Scanner( System.in );
            int niveau = scanner.nextInt();
            System.out.println("Création du rutika niveau " +niveau);
            GenerationPouvoirRutika(niveau, i);
        }
        System.out.println("Fin création Rutika");
    }

    public void GenerationPouvoirRutika(int niveauRutika,int numeroRutika){
        int j = 0;
        int l = 0;
        int k = 0;
        int m = 0;
        int n = 0;
        int o = 0;
        int p = 0;
        int q = 0;
        int hp = 30, CA = 14, vitesse = 9;
        int force = 14, dext = 14,consti = 14, intel =10, sagesse = 10, charisme = 10;
        int degatsPhysiquePince = 108, degatAcide = 106, bonusPhysique = force/5, jds = 14, degatsPhysiqueMorsure = 108;
        int nombreAttaque =1;
        String camouflage = null;
        String poison = null;
        String creuser = null;
        System.out.println("Kutika numéro " +numeroRutika);
        for(int i = 1; i <= niveauRutika*2; i++){
            int min =1;
            int max = 12;
            int range = max - min +1;
            int rand = (int)(Math.random() * range) + min;
            switch (rand) {
                case 1:
                    force = force + 2;
                    degatsPhysiquePince = degatsPhysiquePince + 100;
                    hp = hp +5;
                    //System.out.println("case 1");
                    break;
                case 2:
                    degatsPhysiqueMorsure = degatsPhysiqueMorsure + 100;
                    jds = jds + 4;
                    hp = hp +5;
                    //System.out.println("case 2");
                    break;
                case 3:
                    l++;
                    hp = hp +5;
                    //System.out.println("case 3");
                    if (l == 1) {
                        vitesse = vitesse + 3;
                        System.out.println("Vol disponible");
                    }
                    if (l >= 2) {
                        i--;
                        hp = hp -5;

                    }
                    break;
                case 4:
                    hp = hp + 35;
                    consti = consti + 2;
                    //System.out.println("case 4");
                    break;
                case 5:
                    k++;
                    hp = hp +5;
                    CA = CA + 2;
                    //System.out.println("case 5");
                    break;
                case 6:
                    degatAcide = degatAcide + 102;
                    hp = hp +5;
                    //System.out.println("case 6");
                    if (degatAcide > 412) {
                        i--;
                        hp = hp - 5;
                        //System.out.println("redo acide");
                    }
                    break;
                case 7:
                    j++;
                    hp = hp +5;
                    //System.out.println("case 7");
                    if (j == 1) {
                        camouflage = "Camouflage en action bonus";
                    }
                    if (j == 2) {
                        camouflage = "Commence camouflé, et se déplace de 9m à l'initiative";
                    }
                    if (j == 3) {
                        camouflage ="Avantage discretion, pas de trace de pas";
                    }
                    if (j == 4) {
                        camouflage = "Considéré invisible";
                    }
                    if (j >= 5) {
                        i--;
                        hp = hp - 5;

                    }
                    break;
                case 8:
                    m++;
                    nombreAttaque = nombreAttaque + 1;
                    vitesse = vitesse + 3;
                    hp = hp +5;
                    //System.out.println("case 8");
                    if (m == 1) {
                        System.out.println("evasion AOE");
                    }
                    break;
                case 9:
                    n++;
                    hp = hp +5;

                    //System.out.println("case 9");
                    if (n == 1) {
                        poison = "Dart de poison à distance en action bonus, 1d6 de poison brut. DD10 ou empoisonné";
                    }
                    if (n == 2) {
                        poison = "Dart de poison à distance en action bonus, 2d6 de poison brut. DD13 ou empoisonné";
                    }
                    if (n == 3) {
                        poison = "Dart de poison à distance en action bonus, 3d6 de poison brut. DD16 ou empoisonné";
                    }
                    if (n == 4) {
                        poison = "Dart de poison à distance en action bonus, 4d6 de poison brut. DD19 ou empoisonné et paralysé si raté à plus de 5";
                    }
                    if (n >=5){
                        i--;
                        hp = hp -5;
                    }
                    break;

                case 10:
                    o++;
                    hp = hp +5;
                    //System.out.println("case 10");
                    break;

                case 11:
                    p++;
                    hp = hp +5;
                    //System.out.println("case 11");
                    if (p ==1){
                        creuser = "Peut diviser sa vitesse par 2 et se deplacer sous terre. Laisse terrain difficile derriere lui";
                    }
                    if (p >=1){
                        creuser = "Peut diviser sa vitesse par 2 et se deplacer sous terre. Laisse terrain difficile derriere lui et DD"+1 + 2*p+ "ou entravé";
                    }
                    break;

                case 12:
                    intel = intel +2;
                    hp = hp +5;
                    //System.out.println("case 12");
                    charisme = charisme +2;
                    sagesse = sagesse +2;
                    q++;
                    if (q==1){
                        System.out.println("Peut donner des ordres, rendant intelligent en combat les Rutikas");
                    }
                    break;

                default:
                    System.out.println("ERROR");
            }

        }

        if (k >=1){
            System.out.println("Plus de vulnérabilité, et résistance adaptative à " +k+" élément");
        }
        if (n >= 1){
            System.out.println(poison);
        }
        if(o >= 1){
            System.out.println("Désaventage pour être touché à "+o+ " attaques par tours");
        }
        if (p>=1){
            System.out.println(creuser);
        }
        if (j>= 1){
            System.out.println(camouflage);
        }
        System.out.println("hp = "+hp+" ; CA = "+CA+" ; vitesse = "+vitesse+ " ; stats : "+force+";"+dext+";"+consti+";"+intel+";"+sagesse+";"+charisme+ " ; Dégats pince :" +degatsPhysiquePince+ "" +
                " + "+bonusPhysique+" ; Degats morsure = " +degatsPhysiqueMorsure+ " + "+bonusPhysique+ " et JDS : " +jds+ "; Degats acide : " + degatAcide+ " ; nombre attaque : " +nombreAttaque);

    }





    public int getNombreRutika() {
        return nombreRutika;
    }

    public void setNombreRutika(int nombreRutika) {
        this.nombreRutika = nombreRutika;
    }

    public int getNiveauRutika() {
        return niveauRutika;
    }

    public void setNiveauRutika(int niveauRutika) {
        this.niveauRutika = niveauRutika;
    }
}
