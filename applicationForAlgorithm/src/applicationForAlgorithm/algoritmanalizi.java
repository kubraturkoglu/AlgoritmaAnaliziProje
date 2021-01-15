package applicationForAlgorithm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class algoritmanalizi {

	private JFrame frame;
	private JTextField sayi;
	private JTextField x;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					algoritmanalizi window = new algoritmanalizi();
					window.frame.setVisible(true);
					
                    LinearSearch linearsearch = new LinearSearch();	
                    BinarySearch binarysearch = new BinarySearch();
				    InsertionSort insertionsort = new InsertionSort();
				    BucketSort bucketsort = new BucketSort();
				    CountingSort countingsort = new CountingSort();
				    HeapSort heapsort = new HeapSort();   
				    MergeSort mergesort = new MergeSort();    
				    QuickSort quicksort = new QuickSort();  
				    RadixSort radixsort = new  RadixSort();  
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    
	/**
	 * Create the application.
	 */
	public algoritmanalizi() {
		
	initialize();
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Arial", Font.BOLD, 14));
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 797, 636);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		sayi = new JTextField();
		sayi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
			}
		});
		sayi.setFont(new Font("Arial", Font.BOLD, 14));
		sayi.setBounds(282, 42, 79, 33);
		frame.getContentPane().add(sayi);
		sayi.setColumns(10);
		
		JButton btn1 = new JButton("Baþla");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//	String value = secim1.getSelectedItem();
				
				
				
			}
		});
		btn1.setFont(new Font("Arial", Font.BOLD, 16));
		btn1.setBounds(499, 121, 160, 49);
		frame.getContentPane().add(btn1);
		
		JLabel lblNewLabel = new JLabel("Dizinin eleman sayisini giriniz:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBounds(33, 44, 239, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox secim1 = new JComboBox();
		secim1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					//int diziboyut,aranacaksayi,siralamasonucu;
					//String secim1;
					//diziboyut = Integer.parseInt(sayi.getText());
					//aranacaksayi = Integer.parseInt(x.getText());
				  
					if(secim1.getSelectedItem().equals("Linear search")) {
						LinearSearch.main(null);
						String sayi=(String) sayi.getSelectedItem();
					}
					else if(secim1.getSelectedItem().equals("Binary search")) {
						
					}
					else if(secim1.getSelectedItem().equals("Insertion sort")) {
						
					}
					else if(secim1.getSelectedItem().equals("Merge sort")) {
						
					}
					else if(secim1.getSelectedItem().equals("Heap sort")) {
						
					}
					else if(secim1.getSelectedItem().equals("Quick sort")) {
						
					}
					else if(secim1.getSelectedItem().equals("Counting Sort")) {
						
					}
					else if(secim1.getSelectedItem().equals("Radix Sort")) {
						
					}
					else {
						JOptionPane.showMessageDialog(null,"Öyle bir seçim yok!");
					}
					
					
			
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null,"Geçerli bir numara giriniz!");
				}
			}
		});
		secim1.setFont(new Font("Arial", Font.BOLD, 16));
		secim1.addItem("Linear search");
		secim1.addItem("Binary search");
		secim1.addItem("Insertion sort");
		secim1.addItem("Merge sort");
		secim1.addItem("Heap sort");
		secim1.addItem("Quick sort");
		secim1.addItem("Counting Sort");
		secim1.addItem("Radix Sort");
		secim1.setSelectedItem(null);
		secim1.setBounds(499, 40, 160, 49);
		frame.getContentPane().add(secim1);
		
		
		
		
		
		
		
		
		x = new JTextField();
		x.setFont(new Font("Arial", Font.BOLD, 14));
		x.setBounds(282, 130, 79, 33);
		frame.getContentPane().add(x);
		x.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Aranacak Sayýyý giriniz:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1.setBounds(42, 124, 211, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextPane siralamaSonucu = new JTextPane();
		siralamaSonucu.setFont(new Font("Arial", Font.PLAIN, 15));
		siralamaSonucu.setBounds(42, 265, 306, 284);
		frame.getContentPane().add(siralamaSonucu);
		
		JTextPane aramaSonucu = new JTextPane();
		aramaSonucu.setFont(new Font("Arial", Font.PLAIN, 15));
		aramaSonucu.setBounds(441, 265, 285, 284);
		frame.getContentPane().add(aramaSonucu);
		
		JLabel lblNewLabel_2 = new JLabel("Sýralama sonucu:");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2.setBounds(72, 221, 166, 33);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Arama sonucu:\r\n");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_3.setBounds(460, 221, 154, 33);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
