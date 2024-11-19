
package za.ac.tut.ui;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class TicketsFrame extends JFrame{
    
    private JPanel headingPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel cellphonePnl;
    private JPanel customerDetailsPnl;
    private JPanel homeTeamPnl;
    private JPanel awayTeamPnl;
    private JPanel ticketCostPnl;
    private JPanel numTicketsPnl;
    private JPanel totAmountPnl;
    private JPanel ticketsPnl;
    private JPanel btnsPnl;
    private JPanel ticketsBtnsCombinedPnl;
    private JPanel mainPnl;
    
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel homeTeamLbl;
    private JLabel cellphoneLbl;
    private JLabel awayTeamLbl;
    private JLabel ticketCostLbl;
    private JLabel numTicketsLbl;
    private JLabel totAmountLbl;
    
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    private JTextField cellphoneTxtFld;
    private JTextField homeTeamTxtFld;
    private JTextField awayTeamTxtFld;
    private JTextField ticketCostTxtFld;
    private JTextField totAmountTxtFld;
    
    private JSlider numTicketsSld;
    
    private JButton buyBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    public TicketsFrame(){
        
        setTitle("Ticket sales");
        setSize(500,750);
        setResizable(true);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        cellphonePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        customerDetailsPnl = new JPanel(new GridLayout(3,1,1,1));
        customerDetailsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE,2),"Customer details"));
        
        homeTeamPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        awayTeamPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        ticketCostPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        numTicketsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        totAmountPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        ticketsPnl = new JPanel(new GridLayout(5,1,1,1));
        ticketsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE,2), "Tickets details"));
        
        btnsPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        ticketsBtnsCombinedPnl = new JPanel(new BorderLayout());
        mainPnl = new JPanel(new BorderLayout());
        
        headingLbl = new JLabel("Soccer Match Tickets");
        headingLbl.setFont(new Font(Font.SERIF, Font.BOLD+Font.ITALIC,40));
        headingLbl.setForeground(Color.PINK);
        
        nameLbl = new JLabel("Name:");
        surnameLbl = new JLabel("Surname:");
        cellphoneLbl = new JLabel("Cellphone:");
        homeTeamLbl = new JLabel("Home team:");
        awayTeamLbl = new JLabel("Away Team:");
        ticketCostLbl = new JLabel("Cost price R:");
        numTicketsLbl = new JLabel("Number of tickets required:");
        totAmountLbl = new JLabel("Total amount deu :R");
        
        nameTxtFld = new JTextField(10);
        surnameTxtFld = new JTextField(10);
        cellphoneTxtFld = new JTextField(10);
        homeTeamTxtFld = new JTextField(10);
        awayTeamTxtFld = new JTextField(10);
        ticketCostTxtFld = new JTextField(10);
        
        totAmountTxtFld = new JTextField(20);
        totAmountTxtFld.setText("TO be calculated later.");
        totAmountTxtFld.setEditable(false);
        
        numTicketsSld = new JSlider(1,20);
        
        buyBtn = new JButton ("Buy");
        clearBtn = new JButton ("Clear");
        exitBtn = new JButton ("Exit");
        
        headingPnl.add(headingLbl);
        
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        cellphonePnl.add(cellphoneLbl);
        cellphonePnl.add(cellphoneTxtFld);
        
        customerDetailsPnl.add(namePnl);
        customerDetailsPnl.add(surnamePnl);
        customerDetailsPnl.add(cellphonePnl);
        
        homeTeamPnl.add(homeTeamLbl);
        homeTeamPnl.add(homeTeamTxtFld);
        awayTeamPnl.add(awayTeamLbl);
        awayTeamPnl.add(awayTeamTxtFld);
        ticketCostPnl.add(ticketCostLbl);
        ticketCostPnl.add(ticketCostTxtFld);
        numTicketsPnl.add(numTicketsLbl);
        numTicketsPnl.add(numTicketsSld);
        totAmountPnl.add(totAmountLbl);
        totAmountPnl.add(totAmountTxtFld);
        
        ticketsPnl.add(homeTeamPnl);
        ticketsPnl.add(awayTeamPnl);
        ticketsPnl.add(ticketCostPnl);
        ticketsPnl.add(numTicketsPnl);
        ticketsPnl.add(totAmountPnl);
        
        btnsPnl.add(buyBtn);
        btnsPnl.add(clearBtn);
        btnsPnl.add(exitBtn);
        
        ticketsBtnsCombinedPnl.add(ticketsPnl,BorderLayout.CENTER);
        ticketsBtnsCombinedPnl.add(btnsPnl, BorderLayout.SOUTH);
        
        mainPnl.add(headingPnl, BorderLayout.NORTH);
        mainPnl.add(customerDetailsPnl,BorderLayout.CENTER);
        mainPnl.add(ticketsBtnsCombinedPnl, BorderLayout.SOUTH);
        
        add(mainPnl);
        pack();
        setVisible(true);
        
    }
}
