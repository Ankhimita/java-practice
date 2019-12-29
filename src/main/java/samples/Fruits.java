package samples;

import java.util.ArrayList;
import java.util.List;

    public class Fruits {

        private List<String> fruitsList;

        public List<String> getFruitsList() {
            return fruitsList;
        }

        public void setFruitsList(List<String> fruitsList) {
            this.fruitsList = fruitsList;
        }

        public Fruits(List<String> fl) {
            this.fruitsList = fl;
        }

        public Fruits(Fruits fr) {
            List<String> fl = new ArrayList<>();
            for (String f : fr.getFruitsList()) {
                fl.add(f);
            }
            this.fruitsList = fl;
        }
    }

