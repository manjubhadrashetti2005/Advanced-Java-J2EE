package Swings;

import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class CountryCapitalList extends JFrame {

    private JList<String> countryList;
    private Map<String, String> capitalMap;

    public CountryCapitalList() {

        // Step 1: Create country-capital mapping
        capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "Addis Ababa");
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore");

        // Step 2: Create list model
        DefaultListModel<String> model = new DefaultListModel<>();

        for (String country : capitalMap.keySet()) {
            model.addElement(country);
        }

        // Step 3: Create JList
        countryList = new JList<>(model);

        // Allow multiple selection
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Step 4: Add event listener
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting()) {
                    List<String> selectedCountries = countryList.getSelectedValuesList();

                    for (String country : selectedCountries) {
                        String capital = capitalMap.get(country);
                        System.out.println("Capital of " + country + " is: " + capital);
                    }
                    System.out.println(); // for spacing like output
                }
            }
        });

        // Step 5: Add to frame
        add(new JScrollPane(countryList));

        // Frame settings
        setTitle("Country Capital List");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalList();
    }
}