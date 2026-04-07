public class Sample_Syntax {
    public static void main(String[] args) {
        String[] wordListOne = {
            "24/7","multi-Tier","30,000 foot","B-to-B","win-win",
            "frontend","web-based","pervasive", "smart", "sixsigma",
            "critical-path", "dynamic"
        };
        String[] wordListTwo = {
        "empowered", "sticky","value-added", "oriented", "centric", "distributed",
        "clustered", "branded","outside-the-box", "positioned",
        "networked", "focused", "leveraged", "aligned",
        "targeted", "shared", "cooperative", "accelerated"
        };

        String[] wordListThree = {"process", "tippingpoint",
        "solution", "architecture", "core competency",
        "strategy", "mindshare", "portal", "space", "vision",
        "paradigm", "mission"
        };
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        System.out.println(oneLength);
        System.out.println(twoLength);
        System.out.println(threeLength);

        int ran1 = (int) (Math.random() * oneLength);
        int ran2 = (int) (Math.random() * twoLength);
        int ran3 = (int) (Math.random() * threeLength);

        String phrase ="\n" + wordListOne[ran1]+"\n"+wordListThree[ran2]+"\n"+wordListThree[ran3];
        System.out.println("Now See Radom words are printed :" + phrase);


    }
}