      @Author Abdul Daim
      
      String data = JOptionPane.showInputDialog("Enter a sentence");

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        String[] array = data.split("");

        Iterator iterator = Arrays.stream(array).iterator();
        while(iterator.hasNext()){

            String newdata = (String) iterator.next();
            char X = newdata.charAt(0);

            int Hexdecimal = X;
            arrayList.add(Hexdecimal);
        }

       StringBuffer stringBuffer = new StringBuffer();

        int Salt = Integer.parseInt(JOptionPane.showInputDialog("Enter a Salt value"));
        int Hash = Integer.parseInt(JOptionPane.showInputDialog("Enter a Hash Code"));

        int n = Salt;
        int x = Hash;

        for (Integer s : arrayList) {

           int code = ((1 + n) * x )/ n ;

           char mix = (char) (s + code);

           stringBuffer.append(mix);

        }

        System.out.println(stringBuffer);

        }
