package Q1.Prog52aCl;

public class cl52a { // rectangle (helper class)
        private int myLen;
        private int myWid;
        private int myArea;
        private int myPerim;

        // input section (Constructor)(sets up private data)
        public cl52a(int len, int wid) {
            // set up private data
            myLen = len;
            myWid = wid;
            myArea = 0;
            myPerim = 0;
        }

        // Calculation section (mutator/setter function)(changes things)
        public void calc() {
            myArea = myLen * myWid;
            myPerim = (2 * myLen) + (2 * myWid);
        }

        // output section (accessors/getters functions)
        public int getArea()  { return myArea;  }
        public int getPerim() { return myPerim; }
        // class methods are always: "public <return_type> <name>(<args>) { ... }"
}
