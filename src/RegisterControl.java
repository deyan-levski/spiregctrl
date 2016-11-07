import java.awt.EventQueue;

import java.io.*;
import java.math.BigInteger;
import java.util.Properties;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.Checkbox;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JOptionPane;

import java.awt.Label;
import java.awt.Button;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JRadioButton;
import javax.swing.UIManager;

public class RegisterControl {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws IOException {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterControl window = new RegisterControl();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegisterControl() {
		initialize();
	}

	public static String toNumeralString(final Boolean input) { // converts
		// Boolean to
		// Numeral
		// String
		if (input == null) {
			return "null";
		} else {
			return input.booleanValue() ? "1" : "0";
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frame = new JFrame("ADC Testchip Register Control");
		frame.setBounds(100, 100, 1200, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		frame.getContentPane().setLayout(gridBagLayout);

		Component horizontalGlue_3 = Box.createHorizontalGlue();
		GridBagConstraints gbc_horizontalGlue_3 = new GridBagConstraints();
		gbc_horizontalGlue_3.weighty = 1.0;
		gbc_horizontalGlue_3.weightx = 1.0;
		gbc_horizontalGlue_3.gridwidth = 6;
		gbc_horizontalGlue_3.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalGlue_3.gridx = 2;
		gbc_horizontalGlue_3.gridy = 1;
		frame.getContentPane().add(horizontalGlue_3, gbc_horizontalGlue_3);

		Component verticalGlue = Box.createVerticalGlue();
		GridBagConstraints gbc_verticalGlue = new GridBagConstraints();
		gbc_verticalGlue.weighty = 1.0;
		gbc_verticalGlue.weightx = 1.0;
		gbc_verticalGlue.gridheight = 28;
		gbc_verticalGlue.insets = new Insets(0, 0, 5, 5);
		gbc_verticalGlue.gridx = 1;
		gbc_verticalGlue.gridy = 2;
		frame.getContentPane().add(verticalGlue, gbc_verticalGlue);

		Component verticalGlue_1 = Box.createVerticalGlue();
		GridBagConstraints gbc_verticalGlue_1 = new GridBagConstraints();
		gbc_verticalGlue_1.weighty = 1.0;
		gbc_verticalGlue_1.weightx = 1.0;
		gbc_verticalGlue_1.gridheight = 28;
		gbc_verticalGlue_1.insets = new Insets(0, 0, 5, 5);
		gbc_verticalGlue_1.gridx = 8;
		gbc_verticalGlue_1.gridy = 2;
		frame.getContentPane().add(verticalGlue_1, gbc_verticalGlue_1);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.weightx = 1.0;
		gbc_separator.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator.gridwidth = 4;
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 3;
		gbc_separator.gridy = 3;
		frame.getContentPane().add(separator, gbc_separator);
						
								Checkbox SREG_0 = new Checkbox("col_testmux_pon");
								GridBagConstraints gbc_SREG_0 = new GridBagConstraints();
								gbc_SREG_0.anchor = GridBagConstraints.WEST;
								gbc_SREG_0.insets = new Insets(0, 0, 5, 5);
								gbc_SREG_0.gridx = 2;
								gbc_SREG_0.gridy = 6;
								frame.getContentPane().add(SREG_0, gbc_SREG_0);
						
								Checkbox SREG_17 = new Checkbox("comp_bias<0>");
								GridBagConstraints gbc_SREG_17 = new GridBagConstraints();
								gbc_SREG_17.anchor = GridBagConstraints.WEST;
								gbc_SREG_17.insets = new Insets(0, 0, 5, 5);
								gbc_SREG_17.gridx = 3;
								gbc_SREG_17.gridy = 6;
								frame.getContentPane().add(SREG_17, gbc_SREG_17);
						
								Checkbox SREG_69 = new Checkbox("ref_vref_ramp_slew_ctrl<0>");
								GridBagConstraints gbc_SREG_69 = new GridBagConstraints();
								gbc_SREG_69.anchor = GridBagConstraints.WEST;
								gbc_SREG_69.insets = new Insets(0, 0, 5, 5);
								gbc_SREG_69.gridx = 4;
								gbc_SREG_69.gridy = 6;
								frame.getContentPane().add(SREG_69, gbc_SREG_69);
						
								Checkbox SREG_65 = new Checkbox("ref_vref_ramp_rst_vdac<0>");
								GridBagConstraints gbc_SREG_65 = new GridBagConstraints();
								gbc_SREG_65.anchor = GridBagConstraints.WEST;
								gbc_SREG_65.insets = new Insets(0, 0, 5, 5);
								gbc_SREG_65.gridx = 5;
								gbc_SREG_65.gridy = 6;
								frame.getContentPane().add(SREG_65, gbc_SREG_65);
						
								Checkbox SREG_42 = new Checkbox("count_clk_lvds_rx_dc_on");
								GridBagConstraints gbc_SREG_42 = new GridBagConstraints();
								gbc_SREG_42.anchor = GridBagConstraints.WEST;
								gbc_SREG_42.insets = new Insets(0, 0, 5, 5);
								gbc_SREG_42.gridx = 6;
								gbc_SREG_42.gridy = 6;
								frame.getContentPane().add(SREG_42, gbc_SREG_42);
						
								Checkbox SREG_86 = new Checkbox("digif_lvds_tx_core_cmfb_off");
								GridBagConstraints gbc_SREG_86 = new GridBagConstraints();
								gbc_SREG_86.anchor = GridBagConstraints.WEST;
								gbc_SREG_86.insets = new Insets(0, 0, 5, 5);
								gbc_SREG_86.gridx = 7;
								gbc_SREG_86.gridy = 6;
								frame.getContentPane().add(SREG_86, gbc_SREG_86);
				
						Checkbox SREG_1 = new Checkbox("comp_pon");
						GridBagConstraints gbc_SREG_1 = new GridBagConstraints();
						gbc_SREG_1.anchor = GridBagConstraints.WEST;
						gbc_SREG_1.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_1.gridx = 2;
						gbc_SREG_1.gridy = 7;
						frame.getContentPane().add(SREG_1, gbc_SREG_1);
				
						Checkbox SREG_18 = new Checkbox("comp_bias<1>");
						GridBagConstraints gbc_SREG_18 = new GridBagConstraints();
						gbc_SREG_18.anchor = GridBagConstraints.WEST;
						gbc_SREG_18.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_18.gridx = 3;
						gbc_SREG_18.gridy = 7;
						frame.getContentPane().add(SREG_18, gbc_SREG_18);
				
						Checkbox SREG_70 = new Checkbox("ref_vref_ramp_slew_ctrl<1>");
						GridBagConstraints gbc_SREG_70 = new GridBagConstraints();
						gbc_SREG_70.anchor = GridBagConstraints.WEST;
						gbc_SREG_70.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_70.gridx = 4;
						gbc_SREG_70.gridy = 7;
						frame.getContentPane().add(SREG_70, gbc_SREG_70);
				
						Checkbox SREG_66 = new Checkbox("ref_vref_ramp_rst_vdac<1>");
						GridBagConstraints gbc_SREG_66 = new GridBagConstraints();
						gbc_SREG_66.anchor = GridBagConstraints.WEST;
						gbc_SREG_66.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_66.gridx = 5;
						gbc_SREG_66.gridy = 7;
						frame.getContentPane().add(SREG_66, gbc_SREG_66);
				
						Checkbox SREG_43 = new Checkbox("count_clk_lvds_rx_bias_adj<0>");
						GridBagConstraints gbc_SREG_43 = new GridBagConstraints();
						gbc_SREG_43.anchor = GridBagConstraints.WEST;
						gbc_SREG_43.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_43.gridx = 6;
						gbc_SREG_43.gridy = 7;
						frame.getContentPane().add(SREG_43, gbc_SREG_43);
				
						Checkbox SREG_56 = new Checkbox("ref_vref_lvds_tx_bias_adj<0>");
						GridBagConstraints gbc_SREG_56 = new GridBagConstraints();
						gbc_SREG_56.anchor = GridBagConstraints.WEST;
						gbc_SREG_56.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_56.gridx = 7;
						gbc_SREG_56.gridy = 7;
						frame.getContentPane().add(SREG_56, gbc_SREG_56);
		
				Checkbox SREG_2 = new Checkbox("count_mem_bias_pon");
				GridBagConstraints gbc_SREG_2 = new GridBagConstraints();
				gbc_SREG_2.anchor = GridBagConstraints.WEST;
				gbc_SREG_2.insets = new Insets(0, 0, 5, 5);
				gbc_SREG_2.gridx = 2;
				gbc_SREG_2.gridy = 8;
				frame.getContentPane().add(SREG_2, gbc_SREG_2);
				
						Checkbox SREG_19 = new Checkbox("comp_bias<2>");
						GridBagConstraints gbc_SREG_19 = new GridBagConstraints();
						gbc_SREG_19.anchor = GridBagConstraints.WEST;
						gbc_SREG_19.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_19.gridx = 3;
						gbc_SREG_19.gridy = 8;
						frame.getContentPane().add(SREG_19, gbc_SREG_19);
				
						Checkbox SREG_71 = new Checkbox("ref_vref_ramp_slew_ctrl<2>");
						GridBagConstraints gbc_SREG_71 = new GridBagConstraints();
						gbc_SREG_71.anchor = GridBagConstraints.WEST;
						gbc_SREG_71.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_71.gridx = 4;
						gbc_SREG_71.gridy = 8;
						frame.getContentPane().add(SREG_71, gbc_SREG_71);
				
						Checkbox SREG_67 = new Checkbox("ref_vref_ramp_rst_vdac<2>");
						GridBagConstraints gbc_SREG_67 = new GridBagConstraints();
						gbc_SREG_67.anchor = GridBagConstraints.WEST;
						gbc_SREG_67.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_67.gridx = 5;
						gbc_SREG_67.gridy = 8;
						frame.getContentPane().add(SREG_67, gbc_SREG_67);
				
						Checkbox SREG_44 = new Checkbox("count_clk_lvds_rx_bias_adj<1>");
						GridBagConstraints gbc_SREG_44 = new GridBagConstraints();
						gbc_SREG_44.anchor = GridBagConstraints.WEST;
						gbc_SREG_44.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_44.gridx = 6;
						gbc_SREG_44.gridy = 8;
						frame.getContentPane().add(SREG_44, gbc_SREG_44);
				
						Checkbox SREG_57 = new Checkbox("ref_vref_lvds_tx_bias_adj<1>");
						GridBagConstraints gbc_SREG_57 = new GridBagConstraints();
						gbc_SREG_57.anchor = GridBagConstraints.WEST;
						gbc_SREG_57.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_57.gridx = 7;
						gbc_SREG_57.gridy = 8;
						frame.getContentPane().add(SREG_57, gbc_SREG_57);
		
				Checkbox SREG_3 = new Checkbox("count_clk_lvds_rx_pon");
				GridBagConstraints gbc_SREG_3 = new GridBagConstraints();
				gbc_SREG_3.anchor = GridBagConstraints.WEST;
				gbc_SREG_3.insets = new Insets(0, 0, 5, 5);
				gbc_SREG_3.gridx = 2;
				gbc_SREG_3.gridy = 9;
				frame.getContentPane().add(SREG_3, gbc_SREG_3);
				
						Checkbox SREG_20 = new Checkbox("comp_bias<3>");
						GridBagConstraints gbc_SREG_20 = new GridBagConstraints();
						gbc_SREG_20.anchor = GridBagConstraints.WEST;
						gbc_SREG_20.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_20.gridx = 3;
						gbc_SREG_20.gridy = 9;
						frame.getContentPane().add(SREG_20, gbc_SREG_20);
				
						Checkbox SREG_72 = new Checkbox("ref_vref_ramp_slew_ctrl<3>");
						GridBagConstraints gbc_SREG_72 = new GridBagConstraints();
						gbc_SREG_72.anchor = GridBagConstraints.WEST;
						gbc_SREG_72.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_72.gridx = 4;
						gbc_SREG_72.gridy = 9;
						frame.getContentPane().add(SREG_72, gbc_SREG_72);
				
						Checkbox SREG_68 = new Checkbox("ref_vref_ramp_rst_vdac<3>");
						GridBagConstraints gbc_SREG_68 = new GridBagConstraints();
						gbc_SREG_68.anchor = GridBagConstraints.WEST;
						gbc_SREG_68.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_68.gridx = 5;
						gbc_SREG_68.gridy = 9;
						frame.getContentPane().add(SREG_68, gbc_SREG_68);
				
						Checkbox SREG_45 = new Checkbox("count_clk_lvds_rx_bias_adj<2>");
						GridBagConstraints gbc_SREG_45 = new GridBagConstraints();
						gbc_SREG_45.anchor = GridBagConstraints.WEST;
						gbc_SREG_45.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_45.gridx = 6;
						gbc_SREG_45.gridy = 9;
						frame.getContentPane().add(SREG_45, gbc_SREG_45);
				
						Checkbox SREG_58 = new Checkbox("ref_vref_lvds_tx_bias_adj<2>");
						GridBagConstraints gbc_SREG_58 = new GridBagConstraints();
						gbc_SREG_58.anchor = GridBagConstraints.WEST;
						gbc_SREG_58.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_58.gridx = 7;
						gbc_SREG_58.gridy = 9;
						frame.getContentPane().add(SREG_58, gbc_SREG_58);
		
				Checkbox SREG_4 = new Checkbox("digif_lvds_rx_pon");
				GridBagConstraints gbc_SREG_4 = new GridBagConstraints();
				gbc_SREG_4.anchor = GridBagConstraints.WEST;
				gbc_SREG_4.insets = new Insets(0, 0, 5, 5);
				gbc_SREG_4.gridx = 2;
				gbc_SREG_4.gridy = 10;
				frame.getContentPane().add(SREG_4, gbc_SREG_4);
				
						Checkbox SREG_21 = new Checkbox("comp_bias_drvr<0>");
						GridBagConstraints gbc_SREG_21 = new GridBagConstraints();
						gbc_SREG_21.anchor = GridBagConstraints.WEST;
						gbc_SREG_21.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_21.gridx = 3;
						gbc_SREG_21.gridy = 10;
						frame.getContentPane().add(SREG_21, gbc_SREG_21);
				
						Checkbox SREG_73 = new Checkbox("ref_vref_ramp_slew_ctrl<4>");
						GridBagConstraints gbc_SREG_73 = new GridBagConstraints();
						gbc_SREG_73.anchor = GridBagConstraints.WEST;
						gbc_SREG_73.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_73.gridx = 4;
						gbc_SREG_73.gridy = 10;
						frame.getContentPane().add(SREG_73, gbc_SREG_73);
				
						Checkbox SREG_75 = new Checkbox("ref_vref_ramp_test<0>");
						GridBagConstraints gbc_SREG_75 = new GridBagConstraints();
						gbc_SREG_75.anchor = GridBagConstraints.WEST;
						gbc_SREG_75.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_75.gridx = 5;
						gbc_SREG_75.gridy = 10;
						frame.getContentPane().add(SREG_75, gbc_SREG_75);
				
						Checkbox SREG_46 = new Checkbox("count_clk_lvds_rx_bias_adj<3>");
						GridBagConstraints gbc_SREG_46 = new GridBagConstraints();
						gbc_SREG_46.anchor = GridBagConstraints.WEST;
						gbc_SREG_46.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_46.gridx = 6;
						gbc_SREG_46.gridy = 10;
						frame.getContentPane().add(SREG_46, gbc_SREG_46);
				
						Checkbox SREG_59 = new Checkbox("ref_vref_lvds_tx_bias_adj<3>");
						GridBagConstraints gbc_SREG_59 = new GridBagConstraints();
						gbc_SREG_59.anchor = GridBagConstraints.WEST;
						gbc_SREG_59.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_59.gridx = 7;
						gbc_SREG_59.gridy = 10;
						frame.getContentPane().add(SREG_59, gbc_SREG_59);
		
				Checkbox SREG_5 = new Checkbox("ref_vref_lvds_tx_pon");
				GridBagConstraints gbc_SREG_5 = new GridBagConstraints();
				gbc_SREG_5.anchor = GridBagConstraints.WEST;
				gbc_SREG_5.insets = new Insets(0, 0, 5, 5);
				gbc_SREG_5.gridx = 2;
				gbc_SREG_5.gridy = 11;
				frame.getContentPane().add(SREG_5, gbc_SREG_5);
				
						Checkbox SREG_22 = new Checkbox("comp_bias_drvr<1>");
						GridBagConstraints gbc_SREG_22 = new GridBagConstraints();
						gbc_SREG_22.anchor = GridBagConstraints.WEST;
						gbc_SREG_22.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_22.gridx = 3;
						gbc_SREG_22.gridy = 11;
						frame.getContentPane().add(SREG_22, gbc_SREG_22);
				
						Checkbox SREG_74 = new Checkbox("ref_vref_ramp_slew_ctrl<5>");
						GridBagConstraints gbc_SREG_74 = new GridBagConstraints();
						gbc_SREG_74.anchor = GridBagConstraints.WEST;
						gbc_SREG_74.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_74.gridx = 4;
						gbc_SREG_74.gridy = 11;
						frame.getContentPane().add(SREG_74, gbc_SREG_74);
				
						Checkbox SREG_76 = new Checkbox("ref_vref_ramp_test<1>");
						GridBagConstraints gbc_SREG_76 = new GridBagConstraints();
						gbc_SREG_76.anchor = GridBagConstraints.WEST;
						gbc_SREG_76.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_76.gridx = 5;
						gbc_SREG_76.gridy = 11;
						frame.getContentPane().add(SREG_76, gbc_SREG_76);
				
						Checkbox SREG_47 = new Checkbox("digif_lvds_rx_dc_on");
						GridBagConstraints gbc_SREG_47 = new GridBagConstraints();
						gbc_SREG_47.anchor = GridBagConstraints.WEST;
						gbc_SREG_47.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_47.gridx = 6;
						gbc_SREG_47.gridy = 11;
						frame.getContentPane().add(SREG_47, gbc_SREG_47);
				
						Checkbox SREG_60 = new Checkbox("ref_vref_lvds_tx_vdac_cm_sel<0>");
						GridBagConstraints gbc_SREG_60 = new GridBagConstraints();
						gbc_SREG_60.anchor = GridBagConstraints.WEST;
						gbc_SREG_60.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_60.gridx = 7;
						gbc_SREG_60.gridy = 11;
						frame.getContentPane().add(SREG_60, gbc_SREG_60);
		
				Checkbox SREG_6 = new Checkbox("ref_vref_bias_pon");
				GridBagConstraints gbc_SREG_6 = new GridBagConstraints();
				gbc_SREG_6.anchor = GridBagConstraints.WEST;
				gbc_SREG_6.insets = new Insets(0, 0, 5, 5);
				gbc_SREG_6.gridx = 2;
				gbc_SREG_6.gridy = 12;
				frame.getContentPane().add(SREG_6, gbc_SREG_6);
				
						Checkbox SREG_23 = new Checkbox("comp_bias_drvr<2>");
						GridBagConstraints gbc_SREG_23 = new GridBagConstraints();
						gbc_SREG_23.anchor = GridBagConstraints.WEST;
						gbc_SREG_23.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_23.gridx = 3;
						gbc_SREG_23.gridy = 12;
						frame.getContentPane().add(SREG_23, gbc_SREG_23);
				
						Checkbox SREG_83 = new Checkbox("d_sreg_col_adc_ctrl_test_nc<1>");
						GridBagConstraints gbc_SREG_83 = new GridBagConstraints();
						gbc_SREG_83.anchor = GridBagConstraints.WEST;
						gbc_SREG_83.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_83.gridx = 4;
						gbc_SREG_83.gridy = 12;
						frame.getContentPane().add(SREG_83, gbc_SREG_83);
				
						Checkbox SREG_77 = new Checkbox("ref_vref_ramp_test<2>");
						GridBagConstraints gbc_SREG_77 = new GridBagConstraints();
						gbc_SREG_77.anchor = GridBagConstraints.WEST;
						gbc_SREG_77.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_77.gridx = 5;
						gbc_SREG_77.gridy = 12;
						frame.getContentPane().add(SREG_77, gbc_SREG_77);
				
						Checkbox SREG_48 = new Checkbox("digif_lvds_rx_bias_adj<0>");
						GridBagConstraints gbc_SREG_48 = new GridBagConstraints();
						gbc_SREG_48.anchor = GridBagConstraints.WEST;
						gbc_SREG_48.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_48.gridx = 6;
						gbc_SREG_48.gridy = 12;
						frame.getContentPane().add(SREG_48, gbc_SREG_48);
				
						Checkbox SREG_61 = new Checkbox("ref_vref_lvds_tx_vdac_cm_sel<1>");
						GridBagConstraints gbc_SREG_61 = new GridBagConstraints();
						gbc_SREG_61.anchor = GridBagConstraints.WEST;
						gbc_SREG_61.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_61.gridx = 7;
						gbc_SREG_61.gridy = 12;
						frame.getContentPane().add(SREG_61, gbc_SREG_61);
		
				Checkbox SREG_7 = new Checkbox("ref_vref_ramp_ota_hi_pow");
				GridBagConstraints gbc_SREG_7 = new GridBagConstraints();
				gbc_SREG_7.anchor = GridBagConstraints.WEST;
				gbc_SREG_7.insets = new Insets(0, 0, 5, 5);
				gbc_SREG_7.gridx = 2;
				gbc_SREG_7.gridy = 13;
				frame.getContentPane().add(SREG_7, gbc_SREG_7);
				
						Checkbox SREG_24 = new Checkbox("comp_bias_drvr<3>");
						GridBagConstraints gbc_SREG_24 = new GridBagConstraints();
						gbc_SREG_24.anchor = GridBagConstraints.WEST;
						gbc_SREG_24.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_24.gridx = 3;
						gbc_SREG_24.gridy = 13;
						frame.getContentPane().add(SREG_24, gbc_SREG_24);
				
						Checkbox SREG_84 = new Checkbox("d_sreg_col_adc_ctrl_test_nc<2>");
						GridBagConstraints gbc_SREG_84 = new GridBagConstraints();
						gbc_SREG_84.anchor = GridBagConstraints.WEST;
						gbc_SREG_84.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_84.gridx = 4;
						gbc_SREG_84.gridy = 13;
						frame.getContentPane().add(SREG_84, gbc_SREG_84);
				
						Checkbox SREG_78 = new Checkbox("ref_vref_ramp_test<3>");
						GridBagConstraints gbc_SREG_78 = new GridBagConstraints();
						gbc_SREG_78.anchor = GridBagConstraints.WEST;
						gbc_SREG_78.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_78.gridx = 5;
						gbc_SREG_78.gridy = 13;
						frame.getContentPane().add(SREG_78, gbc_SREG_78);
				
						Checkbox SREG_49 = new Checkbox("digif_lvds_rx_bias_adj<1>");
						GridBagConstraints gbc_SREG_49 = new GridBagConstraints();
						gbc_SREG_49.anchor = GridBagConstraints.WEST;
						gbc_SREG_49.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_49.gridx = 6;
						gbc_SREG_49.gridy = 13;
						frame.getContentPane().add(SREG_49, gbc_SREG_49);
				
						Checkbox SREG_62 = new Checkbox("ref_vref_lvds_tx_vdac_cm_sel<2>");
						GridBagConstraints gbc_SREG_62 = new GridBagConstraints();
						gbc_SREG_62.anchor = GridBagConstraints.WEST;
						gbc_SREG_62.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_62.gridx = 7;
						gbc_SREG_62.gridy = 13;
						frame.getContentPane().add(SREG_62, gbc_SREG_62);
		
				Checkbox SREG_8 = new Checkbox("ref_vref_ramp_pon");
				GridBagConstraints gbc_SREG_8 = new GridBagConstraints();
				gbc_SREG_8.anchor = GridBagConstraints.WEST;
				gbc_SREG_8.insets = new Insets(0, 0, 5, 5);
				gbc_SREG_8.gridx = 2;
				gbc_SREG_8.gridy = 14;
				frame.getContentPane().add(SREG_8, gbc_SREG_8);
				
						Checkbox SREG_25 = new Checkbox("count_mem_ctrl_bias<0>");
						GridBagConstraints gbc_SREG_25 = new GridBagConstraints();
						gbc_SREG_25.anchor = GridBagConstraints.WEST;
						gbc_SREG_25.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_25.gridx = 3;
						gbc_SREG_25.gridy = 14;
						frame.getContentPane().add(SREG_25, gbc_SREG_25);
				
						Checkbox SREG_31 = new Checkbox("count_mem_ctrl_zero_bias<0>");
						GridBagConstraints gbc_SREG_31 = new GridBagConstraints();
						gbc_SREG_31.anchor = GridBagConstraints.WEST;
						gbc_SREG_31.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_31.gridx = 4;
						gbc_SREG_31.gridy = 14;
						frame.getContentPane().add(SREG_31, gbc_SREG_31);
				
						Checkbox SREG_79 = new Checkbox("ref_vref_ramp_test<4>");
						GridBagConstraints gbc_SREG_79 = new GridBagConstraints();
						gbc_SREG_79.anchor = GridBagConstraints.WEST;
						gbc_SREG_79.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_79.gridx = 5;
						gbc_SREG_79.gridy = 14;
						frame.getContentPane().add(SREG_79, gbc_SREG_79);
				
						Checkbox SREG_50 = new Checkbox("digif_lvds_rx_bias_adj<2>");
						GridBagConstraints gbc_SREG_50 = new GridBagConstraints();
						gbc_SREG_50.anchor = GridBagConstraints.WEST;
						gbc_SREG_50.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_50.gridx = 6;
						gbc_SREG_50.gridy = 14;
						frame.getContentPane().add(SREG_50, gbc_SREG_50);
				
						Checkbox SREG_63 = new Checkbox("ref_vref_lvds_tx_vdac_cm_sel<3>");
						GridBagConstraints gbc_SREG_63 = new GridBagConstraints();
						gbc_SREG_63.anchor = GridBagConstraints.WEST;
						gbc_SREG_63.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_63.gridx = 7;
						gbc_SREG_63.gridy = 14;
						frame.getContentPane().add(SREG_63, gbc_SREG_63);
		
				Checkbox SREG_9 = new Checkbox("vln_en");
				GridBagConstraints gbc_SREG_9 = new GridBagConstraints();
				gbc_SREG_9.anchor = GridBagConstraints.WEST;
				gbc_SREG_9.insets = new Insets(0, 0, 5, 5);
				gbc_SREG_9.gridx = 2;
				gbc_SREG_9.gridy = 15;
				frame.getContentPane().add(SREG_9, gbc_SREG_9);
				
						Checkbox SREG_26 = new Checkbox("count_mem_ctrl_bias<1>");
						GridBagConstraints gbc_SREG_26 = new GridBagConstraints();
						gbc_SREG_26.anchor = GridBagConstraints.WEST;
						gbc_SREG_26.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_26.gridx = 3;
						gbc_SREG_26.gridy = 15;
						frame.getContentPane().add(SREG_26, gbc_SREG_26);
				
						Checkbox SREG_32 = new Checkbox("count_mem_ctrl_zero_bias<1>");
						GridBagConstraints gbc_SREG_32 = new GridBagConstraints();
						gbc_SREG_32.anchor = GridBagConstraints.WEST;
						gbc_SREG_32.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_32.gridx = 4;
						gbc_SREG_32.gridy = 15;
						frame.getContentPane().add(SREG_32, gbc_SREG_32);
				
						Checkbox SREG_80 = new Checkbox("ref_vref_ramp_test<5>");
						GridBagConstraints gbc_SREG_80 = new GridBagConstraints();
						gbc_SREG_80.anchor = GridBagConstraints.WEST;
						gbc_SREG_80.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_80.gridx = 5;
						gbc_SREG_80.gridy = 15;
						frame.getContentPane().add(SREG_80, gbc_SREG_80);
				
						Checkbox SREG_51 = new Checkbox("digif_lvds_rx_bias_adj<3>");
						GridBagConstraints gbc_SREG_51 = new GridBagConstraints();
						gbc_SREG_51.anchor = GridBagConstraints.WEST;
						gbc_SREG_51.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_51.gridx = 6;
						gbc_SREG_51.gridy = 15;
						frame.getContentPane().add(SREG_51, gbc_SREG_51);
				
						Checkbox SREG_87 = new Checkbox("vln_vbpc_bypass");
						GridBagConstraints gbc_SREG_87 = new GridBagConstraints();
						gbc_SREG_87.anchor = GridBagConstraints.WEST;
						gbc_SREG_87.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_87.gridx = 7;
						gbc_SREG_87.gridy = 15;
						frame.getContentPane().add(SREG_87, gbc_SREG_87);
		
				Checkbox SREG_10 = new Checkbox("photocore_row_pon");
				GridBagConstraints gbc_SREG_10 = new GridBagConstraints();
				gbc_SREG_10.anchor = GridBagConstraints.WEST;
				gbc_SREG_10.insets = new Insets(0, 0, 5, 5);
				gbc_SREG_10.gridx = 2;
				gbc_SREG_10.gridy = 16;
				frame.getContentPane().add(SREG_10, gbc_SREG_10);
				
						Checkbox SREG_27 = new Checkbox("count_mem_ctrl_bias<2>");
						GridBagConstraints gbc_SREG_27 = new GridBagConstraints();
						gbc_SREG_27.anchor = GridBagConstraints.WEST;
						gbc_SREG_27.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_27.gridx = 3;
						gbc_SREG_27.gridy = 16;
						frame.getContentPane().add(SREG_27, gbc_SREG_27);
				
						Checkbox SREG_33 = new Checkbox("count_mem_ctrl_zero_bias<2>");
						GridBagConstraints gbc_SREG_33 = new GridBagConstraints();
						gbc_SREG_33.anchor = GridBagConstraints.WEST;
						gbc_SREG_33.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_33.gridx = 4;
						gbc_SREG_33.gridy = 16;
						frame.getContentPane().add(SREG_33, gbc_SREG_33);
				
						Checkbox SREG_81 = new Checkbox("ref_vref_ramp_test<6>");
						GridBagConstraints gbc_SREG_81 = new GridBagConstraints();
						gbc_SREG_81.anchor = GridBagConstraints.WEST;
						gbc_SREG_81.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_81.gridx = 5;
						gbc_SREG_81.gridy = 16;
						frame.getContentPane().add(SREG_81, gbc_SREG_81);
				
						Checkbox SREG_52 = new Checkbox("digif_serial_msblsb_mode");
						GridBagConstraints gbc_SREG_52 = new GridBagConstraints();
						gbc_SREG_52.anchor = GridBagConstraints.WEST;
						gbc_SREG_52.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_52.gridx = 6;
						gbc_SREG_52.gridy = 16;
						frame.getContentPane().add(SREG_52, gbc_SREG_52);
				
						Checkbox SREG_88 = new Checkbox("vln_bias<0>");
						GridBagConstraints gbc_SREG_88 = new GridBagConstraints();
						gbc_SREG_88.anchor = GridBagConstraints.WEST;
						gbc_SREG_88.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_88.gridx = 7;
						gbc_SREG_88.gridy = 16;
						frame.getContentPane().add(SREG_88, gbc_SREG_88);
		
				Checkbox SREG_16 = new Checkbox("col_testmux_en");
				GridBagConstraints gbc_SREG_16 = new GridBagConstraints();
				gbc_SREG_16.anchor = GridBagConstraints.WEST;
				gbc_SREG_16.insets = new Insets(0, 0, 5, 5);
				gbc_SREG_16.gridx = 2;
				gbc_SREG_16.gridy = 17;
				frame.getContentPane().add(SREG_16, gbc_SREG_16);
				
						Checkbox SREG_28 = new Checkbox("count_mem_ctrl_bias<3>");
						GridBagConstraints gbc_SREG_28 = new GridBagConstraints();
						gbc_SREG_28.anchor = GridBagConstraints.WEST;
						gbc_SREG_28.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_28.gridx = 3;
						gbc_SREG_28.gridy = 17;
						frame.getContentPane().add(SREG_28, gbc_SREG_28);
				
						Checkbox SREG_34 = new Checkbox("count_mem_ctrl_zero_bias<3>");
						GridBagConstraints gbc_SREG_34 = new GridBagConstraints();
						gbc_SREG_34.anchor = GridBagConstraints.WEST;
						gbc_SREG_34.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_34.gridx = 4;
						gbc_SREG_34.gridy = 17;
						frame.getContentPane().add(SREG_34, gbc_SREG_34);
				
						Checkbox SREG_12 = new Checkbox("col_adc_ctrl_test<0>");
						GridBagConstraints gbc_SREG_12 = new GridBagConstraints();
						gbc_SREG_12.anchor = GridBagConstraints.WEST;
						gbc_SREG_12.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_12.gridx = 5;
						gbc_SREG_12.gridy = 17;
						frame.getContentPane().add(SREG_12, gbc_SREG_12);
				
						Checkbox SREG_53 = new Checkbox("digif_test<0>");
						GridBagConstraints gbc_SREG_53 = new GridBagConstraints();
						gbc_SREG_53.anchor = GridBagConstraints.WEST;
						gbc_SREG_53.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_53.gridx = 6;
						gbc_SREG_53.gridy = 17;
						frame.getContentPane().add(SREG_53, gbc_SREG_53);
				
						Checkbox SREG_89 = new Checkbox("vln_bias<1>");
						GridBagConstraints gbc_SREG_89 = new GridBagConstraints();
						gbc_SREG_89.anchor = GridBagConstraints.WEST;
						gbc_SREG_89.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_89.gridx = 7;
						gbc_SREG_89.gridy = 17;
						frame.getContentPane().add(SREG_89, gbc_SREG_89);
		
				Checkbox SREG_64 = new Checkbox("ref_vref_bias_test_en");
				GridBagConstraints gbc_SREG_64 = new GridBagConstraints();
				gbc_SREG_64.anchor = GridBagConstraints.WEST;
				gbc_SREG_64.insets = new Insets(0, 0, 5, 5);
				gbc_SREG_64.gridx = 2;
				gbc_SREG_64.gridy = 18;
				frame.getContentPane().add(SREG_64, gbc_SREG_64);
				
						Checkbox SREG_29 = new Checkbox("count_mem_ctrl_bias<4>");
						GridBagConstraints gbc_SREG_29 = new GridBagConstraints();
						gbc_SREG_29.anchor = GridBagConstraints.WEST;
						gbc_SREG_29.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_29.gridx = 3;
						gbc_SREG_29.gridy = 18;
						frame.getContentPane().add(SREG_29, gbc_SREG_29);
				
						Checkbox SREG_35 = new Checkbox("count_mem_ctrl_zero_bias<4>");
						GridBagConstraints gbc_SREG_35 = new GridBagConstraints();
						gbc_SREG_35.anchor = GridBagConstraints.WEST;
						gbc_SREG_35.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_35.gridx = 4;
						gbc_SREG_35.gridy = 18;
						frame.getContentPane().add(SREG_35, gbc_SREG_35);
				
						Checkbox SREG_13 = new Checkbox("col_adc_ctrl_test<1>");
						GridBagConstraints gbc_SREG_13 = new GridBagConstraints();
						gbc_SREG_13.anchor = GridBagConstraints.WEST;
						gbc_SREG_13.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_13.gridx = 5;
						gbc_SREG_13.gridy = 18;
						frame.getContentPane().add(SREG_13, gbc_SREG_13);
				
						Checkbox SREG_54 = new Checkbox("digif_test<1>");
						GridBagConstraints gbc_SREG_54 = new GridBagConstraints();
						gbc_SREG_54.anchor = GridBagConstraints.WEST;
						gbc_SREG_54.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_54.gridx = 6;
						gbc_SREG_54.gridy = 18;
						frame.getContentPane().add(SREG_54, gbc_SREG_54);
				
						Checkbox SREG_90 = new Checkbox("vln_bias<2>");
						GridBagConstraints gbc_SREG_90 = new GridBagConstraints();
						gbc_SREG_90.anchor = GridBagConstraints.WEST;
						gbc_SREG_90.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_90.gridx = 7;
						gbc_SREG_90.gridy = 18;
						frame.getContentPane().add(SREG_90, gbc_SREG_90);
		
				Checkbox SREG_37 = new Checkbox("force_en");
				GridBagConstraints gbc_SREG_37 = new GridBagConstraints();
				gbc_SREG_37.anchor = GridBagConstraints.WEST;
				gbc_SREG_37.insets = new Insets(0, 0, 5, 5);
				gbc_SREG_37.gridx = 2;
				gbc_SREG_37.gridy = 19;
				frame.getContentPane().add(SREG_37, gbc_SREG_37);
				
						Checkbox SREG_30 = new Checkbox("count_mem_ctrl_bias<5>");
						GridBagConstraints gbc_SREG_30 = new GridBagConstraints();
						gbc_SREG_30.anchor = GridBagConstraints.WEST;
						gbc_SREG_30.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_30.gridx = 3;
						gbc_SREG_30.gridy = 19;
						frame.getContentPane().add(SREG_30, gbc_SREG_30);
				
						Checkbox SREG_36 = new Checkbox("count_mem_ctrl_zero_bias<5>");
						GridBagConstraints gbc_SREG_36 = new GridBagConstraints();
						gbc_SREG_36.anchor = GridBagConstraints.WEST;
						gbc_SREG_36.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_36.gridx = 4;
						gbc_SREG_36.gridy = 19;
						frame.getContentPane().add(SREG_36, gbc_SREG_36);
				
						Checkbox SREG_14 = new Checkbox("col_adc_ctrl_test<2>");
						GridBagConstraints gbc_SREG_14 = new GridBagConstraints();
						gbc_SREG_14.anchor = GridBagConstraints.WEST;
						gbc_SREG_14.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_14.gridx = 5;
						gbc_SREG_14.gridy = 19;
						frame.getContentPane().add(SREG_14, gbc_SREG_14);
				
						Checkbox SREG_55 = new Checkbox("digif_test<2>");
						GridBagConstraints gbc_SREG_55 = new GridBagConstraints();
						gbc_SREG_55.anchor = GridBagConstraints.WEST;
						gbc_SREG_55.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_55.gridx = 6;
						gbc_SREG_55.gridy = 19;
						frame.getContentPane().add(SREG_55, gbc_SREG_55);
				
						Checkbox SREG_91 = new Checkbox("vln_bias<3>");
						GridBagConstraints gbc_SREG_91 = new GridBagConstraints();
						gbc_SREG_91.anchor = GridBagConstraints.WEST;
						gbc_SREG_91.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_91.gridx = 7;
						gbc_SREG_91.gridy = 19;
						frame.getContentPane().add(SREG_91, gbc_SREG_91);
		
				Checkbox SREG_85 = new Checkbox("d_sreg_col_adc_ctrl_test_nc<3>");
				GridBagConstraints gbc_SREG_85 = new GridBagConstraints();
				gbc_SREG_85.anchor = GridBagConstraints.WEST;
				gbc_SREG_85.insets = new Insets(0, 0, 5, 5);
				gbc_SREG_85.gridx = 2;
				gbc_SREG_85.gridy = 20;
				frame.getContentPane().add(SREG_85, gbc_SREG_85);
				
						Checkbox SREG_38 = new Checkbox("force_coeff<0>");
						GridBagConstraints gbc_SREG_38 = new GridBagConstraints();
						gbc_SREG_38.anchor = GridBagConstraints.WEST;
						gbc_SREG_38.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_38.gridx = 3;
						gbc_SREG_38.gridy = 20;
						frame.getContentPane().add(SREG_38, gbc_SREG_38);
				
						Checkbox SREG_40 = new Checkbox("force_coeff<2>");
						GridBagConstraints gbc_SREG_40 = new GridBagConstraints();
						gbc_SREG_40.anchor = GridBagConstraints.WEST;
						gbc_SREG_40.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_40.gridx = 4;
						gbc_SREG_40.gridy = 20;
						frame.getContentPane().add(SREG_40, gbc_SREG_40);
				
						Checkbox SREG_15 = new Checkbox("col_adc_ctrl_test<3>");
						GridBagConstraints gbc_SREG_15 = new GridBagConstraints();
						gbc_SREG_15.anchor = GridBagConstraints.WEST;
						gbc_SREG_15.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_15.gridx = 5;
						gbc_SREG_15.gridy = 20;
						frame.getContentPane().add(SREG_15, gbc_SREG_15);
				
						Checkbox SREG_94 = new Checkbox("vln_bias<6>");
						GridBagConstraints gbc_SREG_94 = new GridBagConstraints();
						gbc_SREG_94.anchor = GridBagConstraints.WEST;
						gbc_SREG_94.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_94.gridx = 6;
						gbc_SREG_94.gridy = 20;
						frame.getContentPane().add(SREG_94, gbc_SREG_94);
				
						Checkbox SREG_92 = new Checkbox("vln_bias<4>");
						GridBagConstraints gbc_SREG_92 = new GridBagConstraints();
						gbc_SREG_92.anchor = GridBagConstraints.WEST;
						gbc_SREG_92.insets = new Insets(0, 0, 5, 5);
						gbc_SREG_92.gridx = 7;
						gbc_SREG_92.gridy = 20;
						frame.getContentPane().add(SREG_92, gbc_SREG_92);
		
				Checkbox SREG_11 = new Checkbox("nc");
				GridBagConstraints gbc_SREG_11 = new GridBagConstraints();
				gbc_SREG_11.anchor = GridBagConstraints.WEST;
				gbc_SREG_11.insets = new Insets(0, 0, 5, 5);
				gbc_SREG_11.gridx = 2;
				gbc_SREG_11.gridy = 21;
				frame.getContentPane().add(SREG_11, gbc_SREG_11);
		
				Checkbox SREG_39 = new Checkbox("force_coeff<1>");
				GridBagConstraints gbc_SREG_39 = new GridBagConstraints();
				gbc_SREG_39.anchor = GridBagConstraints.WEST;
				gbc_SREG_39.insets = new Insets(0, 0, 5, 5);
				gbc_SREG_39.gridx = 3;
				gbc_SREG_39.gridy = 21;
				frame.getContentPane().add(SREG_39, gbc_SREG_39);
		
				Checkbox SREG_41 = new Checkbox("force_coeff<3>");
				GridBagConstraints gbc_SREG_41 = new GridBagConstraints();
				gbc_SREG_41.anchor = GridBagConstraints.WEST;
				gbc_SREG_41.insets = new Insets(0, 0, 5, 5);
				gbc_SREG_41.gridx = 4;
				gbc_SREG_41.gridy = 21;
				frame.getContentPane().add(SREG_41, gbc_SREG_41);
		
				Checkbox SREG_82 = new Checkbox("d_sreg_col_adc_ctrl_test_nc<0>");
				GridBagConstraints gbc_SREG_82 = new GridBagConstraints();
				gbc_SREG_82.anchor = GridBagConstraints.WEST;
				gbc_SREG_82.insets = new Insets(0, 0, 5, 5);
				gbc_SREG_82.gridx = 5;
				gbc_SREG_82.gridy = 21;
				frame.getContentPane().add(SREG_82, gbc_SREG_82);
		
				Checkbox SREG_95 = new Checkbox("vln_bias<7>");
				GridBagConstraints gbc_SREG_95 = new GridBagConstraints();
				gbc_SREG_95.anchor = GridBagConstraints.WEST;
				gbc_SREG_95.insets = new Insets(0, 0, 5, 5);
				gbc_SREG_95.gridx = 6;
				gbc_SREG_95.gridy = 21;
				frame.getContentPane().add(SREG_95, gbc_SREG_95);
		
				Checkbox SREG_93 = new Checkbox("vln_bias<5>");
				GridBagConstraints gbc_SREG_93 = new GridBagConstraints();
				gbc_SREG_93.anchor = GridBagConstraints.WEST;
				gbc_SREG_93.insets = new Insets(0, 0, 5, 5);
				gbc_SREG_93.gridx = 7;
				gbc_SREG_93.gridy = 21;
				frame.getContentPane().add(SREG_93, gbc_SREG_93);
		
				Label label_1 = new Label("HEX Word:");
				GridBagConstraints gbc_label_1 = new GridBagConstraints();
				gbc_label_1.insets = new Insets(0, 0, 5, 5);
				gbc_label_1.gridx = 2;
				gbc_label_1.gridy = 23;
				frame.getContentPane().add(label_1, gbc_label_1);
		
				TextField hexField = new TextField();
				hexField.setColumns(50);
				GridBagConstraints gbc_hexField = new GridBagConstraints();
				gbc_hexField.gridwidth = 2;
				gbc_hexField.anchor = GridBagConstraints.WEST;
				gbc_hexField.insets = new Insets(0, 0, 5, 5);
				gbc_hexField.gridx = 3;
				gbc_hexField.gridy = 23;
				frame.getContentPane().add(hexField, gbc_hexField);
		
		Label label_6 = new Label("Link Control");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 6;
		gbc_label_6.gridy = 23;
		frame.getContentPane().add(label_6, gbc_label_6);
		
		JSeparator separator_1 = new JSeparator();
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.weightx = 0.5;
		gbc_separator_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_1.insets = new Insets(0, 0, 5, 5);
		gbc_separator_1.gridx = 6;
		gbc_separator_1.gridy = 24;
		frame.getContentPane().add(separator_1, gbc_separator_1);

		Component horizontalGlue_2 = Box.createHorizontalGlue();
		GridBagConstraints gbc_horizontalGlue_2 = new GridBagConstraints();
		gbc_horizontalGlue_2.weighty = 1.0;
		gbc_horizontalGlue_2.weightx = 1.0;
		gbc_horizontalGlue_2.gridwidth = 6;
		gbc_horizontalGlue_2.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalGlue_2.gridx = 2;
		gbc_horizontalGlue_2.gridy = 25;
		frame.getContentPane().add(horizontalGlue_2, gbc_horizontalGlue_2);
		
				Label label_2 = new Label("Binary Word:");
				GridBagConstraints gbc_label_2 = new GridBagConstraints();
				gbc_label_2.insets = new Insets(0, 0, 5, 5);
				gbc_label_2.gridx = 2;
				gbc_label_2.gridy = 26;
				frame.getContentPane().add(label_2, gbc_label_2);
		
				TextField binField = new TextField();
				binField.setColumns(50);
				GridBagConstraints gbc_binField = new GridBagConstraints();
				gbc_binField.gridwidth = 2;
				gbc_binField.anchor = GridBagConstraints.WEST;
				gbc_binField.insets = new Insets(0, 0, 5, 5);
				gbc_binField.gridx = 3;
				gbc_binField.gridy = 26;
				frame.getContentPane().add(binField, gbc_binField);
		
				Label label_3 = new Label("Start Byte:");
				GridBagConstraints gbc_label_3 = new GridBagConstraints();
				gbc_label_3.insets = new Insets(0, 0, 5, 5);
				gbc_label_3.gridx = 5;
				gbc_label_3.gridy = 26;
				frame.getContentPane().add(label_3, gbc_label_3);
				
				Label label_7 = new Label("VDAC Control");
				GridBagConstraints gbc_label_7 = new GridBagConstraints();
				gbc_label_7.insets = new Insets(0, 0, 5, 5);
				gbc_label_7.gridx = 3;
				gbc_label_7.gridy = 27;
				frame.getContentPane().add(label_7, gbc_label_7);
		
				JRadioButton byteButton1 = new JRadioButton("AA");
				buttonGroup.add(byteButton1);
				GridBagConstraints gbc_byteButton1 = new GridBagConstraints();
				gbc_byteButton1.insets = new Insets(0, 0, 5, 5);
				gbc_byteButton1.gridx = 5;
				gbc_byteButton1.gridy = 27;
				frame.getContentPane().add(byteButton1, gbc_byteButton1);
				
						Label label_4 = new Label("Baud Rate:");
						GridBagConstraints gbc_label_4 = new GridBagConstraints();
						gbc_label_4.insets = new Insets(0, 0, 5, 5);
						gbc_label_4.gridx = 6;
						gbc_label_4.gridy = 27;
						frame.getContentPane().add(label_4, gbc_label_4);
				
						Label label_5 = new Label("Device:");
						GridBagConstraints gbc_label_5 = new GridBagConstraints();
						gbc_label_5.insets = new Insets(0, 0, 5, 5);
						gbc_label_5.gridx = 7;
						gbc_label_5.gridy = 27;
						frame.getContentPane().add(label_5, gbc_label_5);
				
				JSeparator separator_2 = new JSeparator();
				GridBagConstraints gbc_separator_2 = new GridBagConstraints();
				gbc_separator_2.fill = GridBagConstraints.HORIZONTAL;
				gbc_separator_2.insets = new Insets(0, 0, 5, 5);
				gbc_separator_2.gridx = 3;
				gbc_separator_2.gridy = 28;
				frame.getContentPane().add(separator_2, gbc_separator_2);
				
				Label label_9 = new Label("Value [DN]:");
				GridBagConstraints gbc_label_9 = new GridBagConstraints();
				gbc_label_9.insets = new Insets(0, 0, 5, 5);
				gbc_label_9.gridx = 4;
				gbc_label_9.gridy = 29;
				frame.getContentPane().add(label_9, gbc_label_9);
		
				JRadioButton byteButton2 = new JRadioButton("AE");
				buttonGroup.add(byteButton2);
				GridBagConstraints gbc_byteButton2 = new GridBagConstraints();
				gbc_byteButton2.insets = new Insets(0, 0, 5, 5);
				gbc_byteButton2.gridx = 5;
				gbc_byteButton2.gridy = 29;
				frame.getContentPane().add(byteButton2, gbc_byteButton2);
		
				TextField baudRateField = new TextField();
				baudRateField.setText("2400");
				baudRateField.setColumns(8);
				GridBagConstraints gbc_baudRateField = new GridBagConstraints();
				gbc_baudRateField.insets = new Insets(0, 0, 5, 5);
				gbc_baudRateField.gridx = 6;
				gbc_baudRateField.gridy = 29;
				frame.getContentPane().add(baudRateField, gbc_baudRateField);
		
				TextField uartDeviceField = new TextField();
				uartDeviceField.setText("/dev/ttyUSB0");
				uartDeviceField.setColumns(14);
				GridBagConstraints gbc_uartDeviceField = new GridBagConstraints();
				gbc_uartDeviceField.insets = new Insets(0, 0, 5, 5);
				gbc_uartDeviceField.gridx = 7;
				gbc_uartDeviceField.gridy = 29;
				frame.getContentPane().add(uartDeviceField, gbc_uartDeviceField);
		
		Label label_8 = new Label("Channel:");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.anchor = GridBagConstraints.WEST;
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 2;
		gbc_label_8.gridy = 30;
		frame.getContentPane().add(label_8, gbc_label_8);
		
		TextField channelField = new TextField();
		channelField.setText("0000");
		channelField.setColumns(8);
		GridBagConstraints gbc_channelField = new GridBagConstraints();
		gbc_channelField.anchor = GridBagConstraints.WEST;
		gbc_channelField.insets = new Insets(0, 0, 5, 5);
		gbc_channelField.gridx = 3;
		gbc_channelField.gridy = 30;
		frame.getContentPane().add(channelField, gbc_channelField);
		
		TextField dacField = new TextField();
		dacField.setText("1024");
		dacField.setColumns(8);
		GridBagConstraints gbc_dacField = new GridBagConstraints();
		gbc_dacField.insets = new Insets(0, 0, 5, 5);
		gbc_dacField.gridx = 4;
		gbc_dacField.gridy = 30;
		frame.getContentPane().add(dacField, gbc_dacField);
		
		Label label_10 = new Label("Command:");
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.anchor = GridBagConstraints.WEST;
		gbc_label_10.insets = new Insets(0, 0, 5, 5);
		gbc_label_10.gridx = 2;
		gbc_label_10.gridy = 31;
		frame.getContentPane().add(label_10, gbc_label_10);
		
		TextField commandField = new TextField();
		commandField.setText("0011");
		commandField.setColumns(8);
		GridBagConstraints gbc_commandField = new GridBagConstraints();
		gbc_commandField.anchor = GridBagConstraints.WEST;
		gbc_commandField.insets = new Insets(0, 0, 5, 5);
		gbc_commandField.gridx = 3;
		gbc_commandField.gridy = 31;
		frame.getContentPane().add(commandField, gbc_commandField);
		
		Checkbox IVREFON = new Checkbox("IVREF on");
		GridBagConstraints gbc_IVREFON = new GridBagConstraints();
		gbc_IVREFON.insets = new Insets(0, 0, 5, 5);
		gbc_IVREFON.gridx = 4;
		gbc_IVREFON.gridy = 31;
		frame.getContentPane().add(IVREFON, gbc_IVREFON);
		
		Label label_11 = new Label("DAC Word:");
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.anchor = GridBagConstraints.WEST;
		gbc_label_11.insets = new Insets(0, 0, 5, 5);
		gbc_label_11.gridx = 2;
		gbc_label_11.gridy = 32;
		frame.getContentPane().add(label_11, gbc_label_11);
		
		TextField dacWordField = new TextField();
		dacWordField.setColumns(16);
		GridBagConstraints gbc_dacWordField = new GridBagConstraints();
		gbc_dacWordField.anchor = GridBagConstraints.WEST;
		gbc_dacWordField.insets = new Insets(0, 0, 5, 5);
		gbc_dacWordField.gridx = 3;
		gbc_dacWordField.gridy = 32;
		frame.getContentPane().add(dacWordField, gbc_dacWordField);
		
		JRadioButton rdbtnDACSELA = new JRadioButton("Select DAC A");
		buttonGroup_1.add(rdbtnDACSELA);
		GridBagConstraints gbc_rdbtnDACSELA = new GridBagConstraints();
		gbc_rdbtnDACSELA.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnDACSELA.gridx = 4;
		gbc_rdbtnDACSELA.gridy = 32;
		frame.getContentPane().add(rdbtnDACSELA, gbc_rdbtnDACSELA);
		
		JRadioButton rdbtnDACSELB = new JRadioButton("Select DAC B");
		buttonGroup_1.add(rdbtnDACSELB);
		GridBagConstraints gbc_rdbtnDACSELB = new GridBagConstraints();
		gbc_rdbtnDACSELB.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnDACSELB.gridx = 4;
		gbc_rdbtnDACSELB.gridy = 33;
		frame.getContentPane().add(rdbtnDACSELB, gbc_rdbtnDACSELB);
		
		Component horizontalGlue_4 = Box.createHorizontalGlue();
		GridBagConstraints gbc_horizontalGlue_4 = new GridBagConstraints();
		gbc_horizontalGlue_4.gridwidth = 6;
		gbc_horizontalGlue_4.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalGlue_4.gridx = 2;
		gbc_horizontalGlue_4.gridy = 34;
		frame.getContentPane().add(horizontalGlue_4, gbc_horizontalGlue_4);

		Component horizontalGlue_1 = Box.createHorizontalGlue();
		GridBagConstraints gbc_horizontalGlue_1 = new GridBagConstraints();
		gbc_horizontalGlue_1.weighty = 1.0;
		gbc_horizontalGlue_1.weightx = 1.0;
		gbc_horizontalGlue_1.gridwidth = 6;
		gbc_horizontalGlue_1.insets = new Insets(0, 0, 0, 5);
		gbc_horizontalGlue_1.gridx = 2;
		gbc_horizontalGlue_1.gridy = 38;
		frame.getContentPane().add(horizontalGlue_1, gbc_horizontalGlue_1);

		Label label = new Label("ADC Testchip Register Control");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.gridwidth = 6;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 2;
		gbc_label.gridy = 2;
		frame.getContentPane().add(label, gbc_label);

		Component horizontalGlue = Box.createHorizontalGlue();
		GridBagConstraints gbc_horizontalGlue = new GridBagConstraints();
		gbc_horizontalGlue.weighty = 1.0;
		gbc_horizontalGlue.weightx = 1.0;
		gbc_horizontalGlue.gridwidth = 6;
		gbc_horizontalGlue.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalGlue.gridx = 2;
		gbc_horizontalGlue.gridy = 5;
		frame.getContentPane().add(horizontalGlue, gbc_horizontalGlue);

		JRadioButton rdbtnUARTLoad = new JRadioButton("Load via UART");
		GridBagConstraints gbc_rdbtnUARTLoad = new GridBagConstraints();
		gbc_rdbtnUARTLoad.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnUARTLoad.gridx = 6;
		gbc_rdbtnUARTLoad.gridy = 26;
		frame.getContentPane().add(rdbtnUARTLoad, gbc_rdbtnUARTLoad);

		Button sendButton = new Button("Send");
		GridBagConstraints gbc_sendButton = new GridBagConstraints();
		gbc_sendButton.insets = new Insets(0, 0, 5, 5);
		gbc_sendButton.gridx = 7;
		gbc_sendButton.gridy = 26;
		frame.getContentPane().add(sendButton, gbc_sendButton);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmLoadRegSettings = new JMenuItem("Load Reg Settings");
		mnFile.add(mntmLoadRegSettings);

		mntmLoadRegSettings.addActionListener(new ActionListener() {
			private Component modalToComponent;

			public void actionPerformed(ActionEvent e) {

				JFileChooser fileChooser = new JFileChooser();
				if (fileChooser.showOpenDialog(modalToComponent) == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					// load from file

					// Reading...
					Properties properties = new Properties();
					// try (InputStream is = new FileInputStream(new
					// File("/tmp/config.properties"))) {
					try (InputStream is = new FileInputStream(file)) {
						properties.load(is);
					} catch (IOException exp) {
						exp.printStackTrace();
					}

					String setSREG_0 = properties.getProperty("settings.SREG_0");
					String setSREG_1 = properties.getProperty("settings.SREG_1");
					String setSREG_2 = properties.getProperty("settings.SREG_2");
					String setSREG_3 = properties.getProperty("settings.SREG_3");
					String setSREG_4 = properties.getProperty("settings.SREG_4");
					String setSREG_5 = properties.getProperty("settings.SREG_5");
					String setSREG_6 = properties.getProperty("settings.SREG_6");
					String setSREG_7 = properties.getProperty("settings.SREG_7");
					String setSREG_8 = properties.getProperty("settings.SREG_8");
					String setSREG_9 = properties.getProperty("settings.SREG_9");
					String setSREG_10 = properties.getProperty("settings.SREG_10");
					String setSREG_11 = properties.getProperty("settings.SREG_11");
					String setSREG_12 = properties.getProperty("settings.SREG_12");
					String setSREG_13 = properties.getProperty("settings.SREG_13");
					String setSREG_14 = properties.getProperty("settings.SREG_14");
					String setSREG_15 = properties.getProperty("settings.SREG_15");
					String setSREG_16 = properties.getProperty("settings.SREG_16");
					String setSREG_17 = properties.getProperty("settings.SREG_17");
					String setSREG_18 = properties.getProperty("settings.SREG_18");
					String setSREG_19 = properties.getProperty("settings.SREG_19");
					String setSREG_20 = properties.getProperty("settings.SREG_20");
					String setSREG_21 = properties.getProperty("settings.SREG_21");
					String setSREG_22 = properties.getProperty("settings.SREG_22");
					String setSREG_23 = properties.getProperty("settings.SREG_23");
					String setSREG_24 = properties.getProperty("settings.SREG_24");
					String setSREG_25 = properties.getProperty("settings.SREG_25");
					String setSREG_26 = properties.getProperty("settings.SREG_26");
					String setSREG_27 = properties.getProperty("settings.SREG_27");
					String setSREG_28 = properties.getProperty("settings.SREG_28");
					String setSREG_29 = properties.getProperty("settings.SREG_29");
					String setSREG_30 = properties.getProperty("settings.SREG_30");
					String setSREG_31 = properties.getProperty("settings.SREG_31");
					String setSREG_32 = properties.getProperty("settings.SREG_32");
					String setSREG_33 = properties.getProperty("settings.SREG_33");
					String setSREG_34 = properties.getProperty("settings.SREG_34");
					String setSREG_35 = properties.getProperty("settings.SREG_35");
					String setSREG_36 = properties.getProperty("settings.SREG_36");
					String setSREG_37 = properties.getProperty("settings.SREG_37");
					String setSREG_38 = properties.getProperty("settings.SREG_38");
					String setSREG_39 = properties.getProperty("settings.SREG_39");
					String setSREG_40 = properties.getProperty("settings.SREG_40");
					String setSREG_41 = properties.getProperty("settings.SREG_41");
					String setSREG_42 = properties.getProperty("settings.SREG_42");
					String setSREG_43 = properties.getProperty("settings.SREG_43");
					String setSREG_44 = properties.getProperty("settings.SREG_44");
					String setSREG_45 = properties.getProperty("settings.SREG_45");
					String setSREG_46 = properties.getProperty("settings.SREG_46");
					String setSREG_47 = properties.getProperty("settings.SREG_47");
					String setSREG_48 = properties.getProperty("settings.SREG_48");
					String setSREG_49 = properties.getProperty("settings.SREG_49");
					String setSREG_50 = properties.getProperty("settings.SREG_50");
					String setSREG_51 = properties.getProperty("settings.SREG_51");
					String setSREG_52 = properties.getProperty("settings.SREG_52");
					String setSREG_53 = properties.getProperty("settings.SREG_53");
					String setSREG_54 = properties.getProperty("settings.SREG_54");
					String setSREG_55 = properties.getProperty("settings.SREG_55");
					String setSREG_56 = properties.getProperty("settings.SREG_56");
					String setSREG_57 = properties.getProperty("settings.SREG_57");
					String setSREG_58 = properties.getProperty("settings.SREG_58");
					String setSREG_59 = properties.getProperty("settings.SREG_59");
					String setSREG_60 = properties.getProperty("settings.SREG_60");
					String setSREG_61 = properties.getProperty("settings.SREG_61");
					String setSREG_62 = properties.getProperty("settings.SREG_62");
					String setSREG_63 = properties.getProperty("settings.SREG_63");
					String setSREG_64 = properties.getProperty("settings.SREG_64");
					String setSREG_65 = properties.getProperty("settings.SREG_65");
					String setSREG_66 = properties.getProperty("settings.SREG_66");
					String setSREG_67 = properties.getProperty("settings.SREG_67");
					String setSREG_68 = properties.getProperty("settings.SREG_68");
					String setSREG_69 = properties.getProperty("settings.SREG_69");
					String setSREG_70 = properties.getProperty("settings.SREG_70");
					String setSREG_71 = properties.getProperty("settings.SREG_71");
					String setSREG_72 = properties.getProperty("settings.SREG_72");
					String setSREG_73 = properties.getProperty("settings.SREG_73");
					String setSREG_74 = properties.getProperty("settings.SREG_74");
					String setSREG_75 = properties.getProperty("settings.SREG_75");
					String setSREG_76 = properties.getProperty("settings.SREG_76");
					String setSREG_77 = properties.getProperty("settings.SREG_77");
					String setSREG_78 = properties.getProperty("settings.SREG_78");
					String setSREG_79 = properties.getProperty("settings.SREG_79");
					String setSREG_80 = properties.getProperty("settings.SREG_80");
					String setSREG_81 = properties.getProperty("settings.SREG_81");
					String setSREG_82 = properties.getProperty("settings.SREG_82");
					String setSREG_83 = properties.getProperty("settings.SREG_83");
					String setSREG_84 = properties.getProperty("settings.SREG_84");
					String setSREG_85 = properties.getProperty("settings.SREG_85");
					String setSREG_86 = properties.getProperty("settings.SREG_86");
					String setSREG_87 = properties.getProperty("settings.SREG_87");
					String setSREG_88 = properties.getProperty("settings.SREG_88");
					String setSREG_89 = properties.getProperty("settings.SREG_89");
					String setSREG_90 = properties.getProperty("settings.SREG_90");
					String setSREG_91 = properties.getProperty("settings.SREG_91");
					String setSREG_92 = properties.getProperty("settings.SREG_92");
					String setSREG_93 = properties.getProperty("settings.SREG_93");
					String setSREG_94 = properties.getProperty("settings.SREG_94");
					String setSREG_95 = properties.getProperty("settings.SREG_95");

					SREG_0.setState(setSREG_0 == null ? false : Boolean.parseBoolean(setSREG_0));
					SREG_1.setState(setSREG_1 == null ? false : Boolean.parseBoolean(setSREG_1));
					SREG_2.setState(setSREG_2 == null ? false : Boolean.parseBoolean(setSREG_2));
					SREG_3.setState(setSREG_3 == null ? false : Boolean.parseBoolean(setSREG_3));
					SREG_4.setState(setSREG_4 == null ? false : Boolean.parseBoolean(setSREG_4));
					SREG_5.setState(setSREG_5 == null ? false : Boolean.parseBoolean(setSREG_5));
					SREG_6.setState(setSREG_6 == null ? false : Boolean.parseBoolean(setSREG_6));
					SREG_7.setState(setSREG_7 == null ? false : Boolean.parseBoolean(setSREG_7));
					SREG_8.setState(setSREG_8 == null ? false : Boolean.parseBoolean(setSREG_8));
					SREG_9.setState(setSREG_9 == null ? false : Boolean.parseBoolean(setSREG_9));
					SREG_10.setState(setSREG_10 == null ? false : Boolean.parseBoolean(setSREG_10));
					SREG_11.setState(setSREG_11 == null ? false : Boolean.parseBoolean(setSREG_11));
					SREG_12.setState(setSREG_12 == null ? false : Boolean.parseBoolean(setSREG_12));
					SREG_13.setState(setSREG_13 == null ? false : Boolean.parseBoolean(setSREG_13));
					SREG_14.setState(setSREG_14 == null ? false : Boolean.parseBoolean(setSREG_14));
					SREG_15.setState(setSREG_15 == null ? false : Boolean.parseBoolean(setSREG_15));
					SREG_16.setState(setSREG_16 == null ? false : Boolean.parseBoolean(setSREG_16));
					SREG_17.setState(setSREG_17 == null ? false : Boolean.parseBoolean(setSREG_17));
					SREG_18.setState(setSREG_18 == null ? false : Boolean.parseBoolean(setSREG_18));
					SREG_19.setState(setSREG_19 == null ? false : Boolean.parseBoolean(setSREG_19));
					SREG_20.setState(setSREG_20 == null ? false : Boolean.parseBoolean(setSREG_20));
					SREG_21.setState(setSREG_21 == null ? false : Boolean.parseBoolean(setSREG_21));
					SREG_22.setState(setSREG_22 == null ? false : Boolean.parseBoolean(setSREG_22));
					SREG_23.setState(setSREG_23 == null ? false : Boolean.parseBoolean(setSREG_23));
					SREG_24.setState(setSREG_24 == null ? false : Boolean.parseBoolean(setSREG_24));
					SREG_25.setState(setSREG_25 == null ? false : Boolean.parseBoolean(setSREG_25));
					SREG_26.setState(setSREG_26 == null ? false : Boolean.parseBoolean(setSREG_26));
					SREG_27.setState(setSREG_27 == null ? false : Boolean.parseBoolean(setSREG_27));
					SREG_28.setState(setSREG_28 == null ? false : Boolean.parseBoolean(setSREG_28));
					SREG_29.setState(setSREG_29 == null ? false : Boolean.parseBoolean(setSREG_29));
					SREG_30.setState(setSREG_30 == null ? false : Boolean.parseBoolean(setSREG_30));
					SREG_31.setState(setSREG_31 == null ? false : Boolean.parseBoolean(setSREG_31));
					SREG_32.setState(setSREG_32 == null ? false : Boolean.parseBoolean(setSREG_32));
					SREG_33.setState(setSREG_33 == null ? false : Boolean.parseBoolean(setSREG_33));
					SREG_34.setState(setSREG_34 == null ? false : Boolean.parseBoolean(setSREG_34));
					SREG_35.setState(setSREG_35 == null ? false : Boolean.parseBoolean(setSREG_35));
					SREG_36.setState(setSREG_36 == null ? false : Boolean.parseBoolean(setSREG_36));
					SREG_37.setState(setSREG_37 == null ? false : Boolean.parseBoolean(setSREG_37));
					SREG_38.setState(setSREG_38 == null ? false : Boolean.parseBoolean(setSREG_38));
					SREG_39.setState(setSREG_39 == null ? false : Boolean.parseBoolean(setSREG_39));
					SREG_40.setState(setSREG_40 == null ? false : Boolean.parseBoolean(setSREG_40));
					SREG_41.setState(setSREG_41 == null ? false : Boolean.parseBoolean(setSREG_41));
					SREG_42.setState(setSREG_42 == null ? false : Boolean.parseBoolean(setSREG_42));
					SREG_43.setState(setSREG_43 == null ? false : Boolean.parseBoolean(setSREG_43));
					SREG_44.setState(setSREG_44 == null ? false : Boolean.parseBoolean(setSREG_44));
					SREG_45.setState(setSREG_45 == null ? false : Boolean.parseBoolean(setSREG_45));
					SREG_46.setState(setSREG_46 == null ? false : Boolean.parseBoolean(setSREG_46));
					SREG_47.setState(setSREG_47 == null ? false : Boolean.parseBoolean(setSREG_47));
					SREG_48.setState(setSREG_48 == null ? false : Boolean.parseBoolean(setSREG_48));
					SREG_49.setState(setSREG_49 == null ? false : Boolean.parseBoolean(setSREG_49));
					SREG_50.setState(setSREG_50 == null ? false : Boolean.parseBoolean(setSREG_50));
					SREG_51.setState(setSREG_51 == null ? false : Boolean.parseBoolean(setSREG_51));
					SREG_52.setState(setSREG_52 == null ? false : Boolean.parseBoolean(setSREG_52));
					SREG_53.setState(setSREG_53 == null ? false : Boolean.parseBoolean(setSREG_53));
					SREG_54.setState(setSREG_54 == null ? false : Boolean.parseBoolean(setSREG_54));
					SREG_55.setState(setSREG_55 == null ? false : Boolean.parseBoolean(setSREG_55));
					SREG_56.setState(setSREG_56 == null ? false : Boolean.parseBoolean(setSREG_56));
					SREG_57.setState(setSREG_57 == null ? false : Boolean.parseBoolean(setSREG_57));
					SREG_58.setState(setSREG_58 == null ? false : Boolean.parseBoolean(setSREG_58));
					SREG_59.setState(setSREG_59 == null ? false : Boolean.parseBoolean(setSREG_59));
					SREG_60.setState(setSREG_60 == null ? false : Boolean.parseBoolean(setSREG_60));
					SREG_61.setState(setSREG_61 == null ? false : Boolean.parseBoolean(setSREG_61));
					SREG_62.setState(setSREG_62 == null ? false : Boolean.parseBoolean(setSREG_62));
					SREG_63.setState(setSREG_63 == null ? false : Boolean.parseBoolean(setSREG_63));
					SREG_64.setState(setSREG_64 == null ? false : Boolean.parseBoolean(setSREG_64));
					SREG_65.setState(setSREG_65 == null ? false : Boolean.parseBoolean(setSREG_65));
					SREG_66.setState(setSREG_66 == null ? false : Boolean.parseBoolean(setSREG_66));
					SREG_67.setState(setSREG_67 == null ? false : Boolean.parseBoolean(setSREG_67));
					SREG_68.setState(setSREG_68 == null ? false : Boolean.parseBoolean(setSREG_68));
					SREG_69.setState(setSREG_69 == null ? false : Boolean.parseBoolean(setSREG_69));
					SREG_70.setState(setSREG_70 == null ? false : Boolean.parseBoolean(setSREG_70));
					SREG_71.setState(setSREG_71 == null ? false : Boolean.parseBoolean(setSREG_71));
					SREG_72.setState(setSREG_72 == null ? false : Boolean.parseBoolean(setSREG_72));
					SREG_73.setState(setSREG_73 == null ? false : Boolean.parseBoolean(setSREG_73));
					SREG_74.setState(setSREG_74 == null ? false : Boolean.parseBoolean(setSREG_74));
					SREG_75.setState(setSREG_75 == null ? false : Boolean.parseBoolean(setSREG_75));
					SREG_76.setState(setSREG_76 == null ? false : Boolean.parseBoolean(setSREG_76));
					SREG_77.setState(setSREG_77 == null ? false : Boolean.parseBoolean(setSREG_77));
					SREG_78.setState(setSREG_78 == null ? false : Boolean.parseBoolean(setSREG_78));
					SREG_79.setState(setSREG_79 == null ? false : Boolean.parseBoolean(setSREG_79));
					SREG_80.setState(setSREG_80 == null ? false : Boolean.parseBoolean(setSREG_80));
					SREG_81.setState(setSREG_81 == null ? false : Boolean.parseBoolean(setSREG_81));
					SREG_82.setState(setSREG_82 == null ? false : Boolean.parseBoolean(setSREG_82));
					SREG_83.setState(setSREG_83 == null ? false : Boolean.parseBoolean(setSREG_83));
					SREG_84.setState(setSREG_84 == null ? false : Boolean.parseBoolean(setSREG_84));
					SREG_85.setState(setSREG_85 == null ? false : Boolean.parseBoolean(setSREG_85));
					SREG_86.setState(setSREG_86 == null ? false : Boolean.parseBoolean(setSREG_86));
					SREG_87.setState(setSREG_87 == null ? false : Boolean.parseBoolean(setSREG_87));
					SREG_88.setState(setSREG_88 == null ? false : Boolean.parseBoolean(setSREG_88));
					SREG_89.setState(setSREG_89 == null ? false : Boolean.parseBoolean(setSREG_89));
					SREG_90.setState(setSREG_90 == null ? false : Boolean.parseBoolean(setSREG_90));
					SREG_91.setState(setSREG_91 == null ? false : Boolean.parseBoolean(setSREG_91));
					SREG_92.setState(setSREG_92 == null ? false : Boolean.parseBoolean(setSREG_92));
					SREG_93.setState(setSREG_93 == null ? false : Boolean.parseBoolean(setSREG_93));
					SREG_94.setState(setSREG_94 == null ? false : Boolean.parseBoolean(setSREG_94));
					SREG_95.setState(setSREG_95 == null ? false : Boolean.parseBoolean(setSREG_95));

				}

			}
		});

		JMenuItem mntmSaveRegSettings = new JMenuItem("Save Reg Settings");
		mnFile.add(mntmSaveRegSettings);

		mntmSaveRegSettings.addActionListener(new ActionListener() {
			private Component modalToComponent;

			public void actionPerformed(ActionEvent e) {

				JFileChooser fileChooser = new JFileChooser();
				if (fileChooser.showSaveDialog(modalToComponent) == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();

					// Writing settings to file
					Properties properties = new Properties();
					properties.put("settings.SREG_0", String.valueOf(SREG_0.getState()));
					properties.put("settings.SREG_1", String.valueOf(SREG_1.getState()));
					properties.put("settings.SREG_2", String.valueOf(SREG_2.getState()));
					properties.put("settings.SREG_3", String.valueOf(SREG_3.getState()));
					properties.put("settings.SREG_4", String.valueOf(SREG_4.getState()));
					properties.put("settings.SREG_5", String.valueOf(SREG_5.getState()));
					properties.put("settings.SREG_6", String.valueOf(SREG_6.getState()));
					properties.put("settings.SREG_7", String.valueOf(SREG_7.getState()));
					properties.put("settings.SREG_8", String.valueOf(SREG_8.getState()));
					properties.put("settings.SREG_9", String.valueOf(SREG_9.getState()));
					properties.put("settings.SREG_10", String.valueOf(SREG_10.getState()));
					properties.put("settings.SREG_11", String.valueOf(SREG_11.getState()));
					properties.put("settings.SREG_12", String.valueOf(SREG_12.getState()));
					properties.put("settings.SREG_13", String.valueOf(SREG_13.getState()));
					properties.put("settings.SREG_14", String.valueOf(SREG_14.getState()));
					properties.put("settings.SREG_15", String.valueOf(SREG_15.getState()));
					properties.put("settings.SREG_16", String.valueOf(SREG_16.getState()));
					properties.put("settings.SREG_17", String.valueOf(SREG_17.getState()));
					properties.put("settings.SREG_18", String.valueOf(SREG_18.getState()));
					properties.put("settings.SREG_19", String.valueOf(SREG_19.getState()));
					properties.put("settings.SREG_20", String.valueOf(SREG_20.getState()));
					properties.put("settings.SREG_21", String.valueOf(SREG_21.getState()));
					properties.put("settings.SREG_22", String.valueOf(SREG_22.getState()));
					properties.put("settings.SREG_23", String.valueOf(SREG_23.getState()));
					properties.put("settings.SREG_24", String.valueOf(SREG_24.getState()));
					properties.put("settings.SREG_25", String.valueOf(SREG_25.getState()));
					properties.put("settings.SREG_26", String.valueOf(SREG_26.getState()));
					properties.put("settings.SREG_27", String.valueOf(SREG_27.getState()));
					properties.put("settings.SREG_28", String.valueOf(SREG_28.getState()));
					properties.put("settings.SREG_29", String.valueOf(SREG_29.getState()));
					properties.put("settings.SREG_30", String.valueOf(SREG_30.getState()));
					properties.put("settings.SREG_31", String.valueOf(SREG_31.getState()));
					properties.put("settings.SREG_32", String.valueOf(SREG_32.getState()));
					properties.put("settings.SREG_33", String.valueOf(SREG_33.getState()));
					properties.put("settings.SREG_34", String.valueOf(SREG_34.getState()));
					properties.put("settings.SREG_35", String.valueOf(SREG_35.getState()));
					properties.put("settings.SREG_36", String.valueOf(SREG_36.getState()));
					properties.put("settings.SREG_37", String.valueOf(SREG_37.getState()));
					properties.put("settings.SREG_38", String.valueOf(SREG_38.getState()));
					properties.put("settings.SREG_39", String.valueOf(SREG_39.getState()));
					properties.put("settings.SREG_40", String.valueOf(SREG_40.getState()));
					properties.put("settings.SREG_41", String.valueOf(SREG_41.getState()));
					properties.put("settings.SREG_42", String.valueOf(SREG_42.getState()));
					properties.put("settings.SREG_43", String.valueOf(SREG_43.getState()));
					properties.put("settings.SREG_44", String.valueOf(SREG_44.getState()));
					properties.put("settings.SREG_45", String.valueOf(SREG_45.getState()));
					properties.put("settings.SREG_46", String.valueOf(SREG_46.getState()));
					properties.put("settings.SREG_47", String.valueOf(SREG_47.getState()));
					properties.put("settings.SREG_48", String.valueOf(SREG_48.getState()));
					properties.put("settings.SREG_49", String.valueOf(SREG_49.getState()));
					properties.put("settings.SREG_50", String.valueOf(SREG_50.getState()));
					properties.put("settings.SREG_51", String.valueOf(SREG_51.getState()));
					properties.put("settings.SREG_52", String.valueOf(SREG_52.getState()));
					properties.put("settings.SREG_53", String.valueOf(SREG_53.getState()));
					properties.put("settings.SREG_54", String.valueOf(SREG_54.getState()));
					properties.put("settings.SREG_55", String.valueOf(SREG_55.getState()));
					properties.put("settings.SREG_56", String.valueOf(SREG_56.getState()));
					properties.put("settings.SREG_57", String.valueOf(SREG_57.getState()));
					properties.put("settings.SREG_58", String.valueOf(SREG_58.getState()));
					properties.put("settings.SREG_59", String.valueOf(SREG_59.getState()));
					properties.put("settings.SREG_60", String.valueOf(SREG_60.getState()));
					properties.put("settings.SREG_61", String.valueOf(SREG_61.getState()));
					properties.put("settings.SREG_62", String.valueOf(SREG_62.getState()));
					properties.put("settings.SREG_63", String.valueOf(SREG_63.getState()));
					properties.put("settings.SREG_64", String.valueOf(SREG_64.getState()));
					properties.put("settings.SREG_65", String.valueOf(SREG_65.getState()));
					properties.put("settings.SREG_66", String.valueOf(SREG_66.getState()));
					properties.put("settings.SREG_67", String.valueOf(SREG_67.getState()));
					properties.put("settings.SREG_68", String.valueOf(SREG_68.getState()));
					properties.put("settings.SREG_69", String.valueOf(SREG_69.getState()));
					properties.put("settings.SREG_70", String.valueOf(SREG_70.getState()));
					properties.put("settings.SREG_71", String.valueOf(SREG_71.getState()));
					properties.put("settings.SREG_72", String.valueOf(SREG_72.getState()));
					properties.put("settings.SREG_73", String.valueOf(SREG_73.getState()));
					properties.put("settings.SREG_74", String.valueOf(SREG_74.getState()));
					properties.put("settings.SREG_75", String.valueOf(SREG_75.getState()));
					properties.put("settings.SREG_76", String.valueOf(SREG_76.getState()));
					properties.put("settings.SREG_77", String.valueOf(SREG_77.getState()));
					properties.put("settings.SREG_78", String.valueOf(SREG_78.getState()));
					properties.put("settings.SREG_79", String.valueOf(SREG_79.getState()));
					properties.put("settings.SREG_80", String.valueOf(SREG_80.getState()));
					properties.put("settings.SREG_81", String.valueOf(SREG_81.getState()));
					properties.put("settings.SREG_82", String.valueOf(SREG_82.getState()));
					properties.put("settings.SREG_83", String.valueOf(SREG_83.getState()));
					properties.put("settings.SREG_84", String.valueOf(SREG_84.getState()));
					properties.put("settings.SREG_85", String.valueOf(SREG_85.getState()));
					properties.put("settings.SREG_86", String.valueOf(SREG_86.getState()));
					properties.put("settings.SREG_87", String.valueOf(SREG_87.getState()));
					properties.put("settings.SREG_88", String.valueOf(SREG_88.getState()));
					properties.put("settings.SREG_89", String.valueOf(SREG_89.getState()));
					properties.put("settings.SREG_90", String.valueOf(SREG_90.getState()));
					properties.put("settings.SREG_91", String.valueOf(SREG_91.getState()));
					properties.put("settings.SREG_92", String.valueOf(SREG_92.getState()));
					properties.put("settings.SREG_93", String.valueOf(SREG_93.getState()));
					properties.put("settings.SREG_94", String.valueOf(SREG_94.getState()));
					properties.put("settings.SREG_95", String.valueOf(SREG_95.getState()));

					try (OutputStream os = new FileOutputStream(file)) {
						properties.store(os, "Form settings");
					} catch (IOException exp) {
						exp.printStackTrace();
					}
				}
			}
		});

		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);

		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		JMenu mnRegisterMap = new JMenu("Register Map");
		menuBar.add(mnRegisterMap);

		JMenuItem mntmOpenRegisterTable = new JMenuItem("Open Register Table");
		mnRegisterMap.add(mntmOpenRegisterTable);

		JMenuItem mntmSchematics = new JMenuItem("Schematics");
		mnRegisterMap.add(mntmSchematics);

		JMenu mnDocumentation = new JMenu("Documentation");
		menuBar.add(mnDocumentation);

		JMenuItem mntmMicroarchitecture = new JMenuItem("Microarchitecture");
		mnDocumentation.add(mntmMicroarchitecture);

		JMenuItem mntmChipPhysicalDiagram = new JMenuItem("Chip Physical Diagram");
		mnDocumentation.add(mntmChipPhysicalDiagram);

		JMenuItem mntmPinoutList = new JMenuItem("Pinout List");
		mnDocumentation.add(mntmPinoutList);

		JMenuItem mntmPcbSchematics = new JMenuItem("PCB Schematics");
		mnDocumentation.add(mntmPcbSchematics);

		JMenu mnAbout = new JMenu("Help");
		menuBar.add(mnAbout);

		JMenuItem mntmAdcTestchipRegister = new JMenuItem("About");
		mnAbout.add(mntmAdcTestchipRegister);

		mntmAdcTestchipRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// custom title, custom icon
				JOptionPane
						.showMessageDialog(frame,
								"jcRampAD Register Settings Loader \n" + "Version P1A, 12 Sept 2016 \n"
										+ "Deyan Levski, deyan.levski@eng.ox.ac.uk",
								"About", JOptionPane.INFORMATION_MESSAGE);
			}
		});

		sendButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String strSREG_0 = toNumeralString(SREG_0.getState());
				String strSREG_1 = toNumeralString(SREG_1.getState());
				String strSREG_2 = toNumeralString(SREG_2.getState());
				String strSREG_3 = toNumeralString(SREG_3.getState());
				String strSREG_4 = toNumeralString(SREG_4.getState());
				String strSREG_5 = toNumeralString(SREG_5.getState());
				String strSREG_6 = toNumeralString(SREG_6.getState());
				String strSREG_7 = toNumeralString(SREG_7.getState());
				String strSREG_8 = toNumeralString(SREG_8.getState());
				String strSREG_9 = toNumeralString(SREG_9.getState());
				String strSREG_10 = toNumeralString(SREG_10.getState());
				String strSREG_11 = toNumeralString(SREG_11.getState());
				String strSREG_12 = toNumeralString(SREG_12.getState());
				String strSREG_13 = toNumeralString(SREG_13.getState());
				String strSREG_14 = toNumeralString(SREG_14.getState());
				String strSREG_15 = toNumeralString(SREG_15.getState());
				String strSREG_16 = toNumeralString(SREG_16.getState());
				String strSREG_17 = toNumeralString(SREG_17.getState());
				String strSREG_18 = toNumeralString(SREG_18.getState());
				String strSREG_19 = toNumeralString(SREG_19.getState());
				String strSREG_20 = toNumeralString(SREG_20.getState());
				String strSREG_21 = toNumeralString(SREG_21.getState());
				String strSREG_22 = toNumeralString(SREG_22.getState());
				String strSREG_23 = toNumeralString(SREG_23.getState());
				String strSREG_24 = toNumeralString(SREG_24.getState());
				String strSREG_25 = toNumeralString(SREG_25.getState());
				String strSREG_26 = toNumeralString(SREG_26.getState());
				String strSREG_27 = toNumeralString(SREG_27.getState());
				String strSREG_28 = toNumeralString(SREG_28.getState());
				String strSREG_29 = toNumeralString(SREG_29.getState());
				String strSREG_30 = toNumeralString(SREG_30.getState());
				String strSREG_31 = toNumeralString(SREG_31.getState());
				String strSREG_32 = toNumeralString(SREG_32.getState());
				String strSREG_33 = toNumeralString(SREG_33.getState());
				String strSREG_34 = toNumeralString(SREG_34.getState());
				String strSREG_35 = toNumeralString(SREG_35.getState());
				String strSREG_36 = toNumeralString(SREG_36.getState());
				String strSREG_37 = toNumeralString(SREG_37.getState());
				String strSREG_38 = toNumeralString(SREG_38.getState());
				String strSREG_39 = toNumeralString(SREG_39.getState());
				String strSREG_40 = toNumeralString(SREG_40.getState());
				String strSREG_41 = toNumeralString(SREG_41.getState());
				String strSREG_42 = toNumeralString(SREG_42.getState());
				String strSREG_43 = toNumeralString(SREG_43.getState());
				String strSREG_44 = toNumeralString(SREG_44.getState());
				String strSREG_45 = toNumeralString(SREG_45.getState());
				String strSREG_46 = toNumeralString(SREG_46.getState());
				String strSREG_47 = toNumeralString(SREG_47.getState());
				String strSREG_48 = toNumeralString(SREG_48.getState());
				String strSREG_49 = toNumeralString(SREG_49.getState());
				String strSREG_50 = toNumeralString(SREG_50.getState());
				String strSREG_51 = toNumeralString(SREG_51.getState());
				String strSREG_52 = toNumeralString(SREG_52.getState());
				String strSREG_53 = toNumeralString(SREG_53.getState());
				String strSREG_54 = toNumeralString(SREG_54.getState());
				String strSREG_55 = toNumeralString(SREG_55.getState());
				String strSREG_56 = toNumeralString(SREG_56.getState());
				String strSREG_57 = toNumeralString(SREG_57.getState());
				String strSREG_58 = toNumeralString(SREG_58.getState());
				String strSREG_59 = toNumeralString(SREG_59.getState());
				String strSREG_60 = toNumeralString(SREG_60.getState());
				String strSREG_61 = toNumeralString(SREG_61.getState());
				String strSREG_62 = toNumeralString(SREG_62.getState());
				String strSREG_63 = toNumeralString(SREG_63.getState());
				String strSREG_64 = toNumeralString(SREG_64.getState());
				String strSREG_65 = toNumeralString(SREG_65.getState());
				String strSREG_66 = toNumeralString(SREG_66.getState());
				String strSREG_67 = toNumeralString(SREG_67.getState());
				String strSREG_68 = toNumeralString(SREG_68.getState());
				String strSREG_69 = toNumeralString(SREG_69.getState());
				String strSREG_70 = toNumeralString(SREG_70.getState());
				String strSREG_71 = toNumeralString(SREG_71.getState());
				String strSREG_72 = toNumeralString(SREG_72.getState());
				String strSREG_73 = toNumeralString(SREG_73.getState());
				String strSREG_74 = toNumeralString(SREG_74.getState());
				String strSREG_75 = toNumeralString(SREG_75.getState());
				String strSREG_76 = toNumeralString(SREG_76.getState());
				String strSREG_77 = toNumeralString(SREG_77.getState());
				String strSREG_78 = toNumeralString(SREG_78.getState());
				String strSREG_79 = toNumeralString(SREG_79.getState());
				String strSREG_80 = toNumeralString(SREG_80.getState());
				String strSREG_81 = toNumeralString(SREG_81.getState());
				String strSREG_82 = toNumeralString(SREG_82.getState());
				String strSREG_83 = toNumeralString(SREG_83.getState());
				String strSREG_84 = toNumeralString(SREG_84.getState());
				String strSREG_85 = toNumeralString(SREG_85.getState());
				String strSREG_86 = toNumeralString(SREG_86.getState());
				String strSREG_87 = toNumeralString(SREG_87.getState());
				String strSREG_88 = toNumeralString(SREG_88.getState());
				String strSREG_89 = toNumeralString(SREG_89.getState());
				String strSREG_90 = toNumeralString(SREG_90.getState());
				String strSREG_91 = toNumeralString(SREG_91.getState());
				String strSREG_92 = toNumeralString(SREG_92.getState());
				String strSREG_93 = toNumeralString(SREG_93.getState());
				String strSREG_94 = toNumeralString(SREG_94.getState());
				String strSREG_95 = toNumeralString(SREG_95.getState());
				
				String strIVREF = toNumeralString(IVREFON.getState());
				
				String strSELDAC = "0";
						
				if (rdbtnDACSELA.isSelected()){
					strSELDAC = "1";
				} else {
					strSELDAC = "0";
				}
				
				String strVoltVal = dacField.getText();
				int voltVal = Integer.parseInt(strVoltVal);
				
				String strBinVoltVal = String.format("%14s", Integer.toBinaryString(voltVal)).replace(' ', '0');
				
				//String strBinVoltVal = Integer.toString(voltVal, 2);
				
				String strChannel = channelField.getText();
				String strCommand = commandField.getText();

				String startByte = "10101010";

				if (byteButton1.isSelected()) {
					startByte = "10101010";
				} else {
					startByte = "10101110";
				}

				// new StringBuilder(strSREG_0).reverse().toString();

				String byte1 = new StringBuilder(
						strSREG_0 + strSREG_1 + strSREG_2 + strSREG_3 + strSREG_4 + strSREG_5 + strSREG_6 + strSREG_7)
								.reverse().toString();
				String byte2 = new StringBuilder(strSREG_8 + strSREG_9 + strSREG_10 + strSREG_11 + strSREG_12
						+ strSREG_13 + strSREG_14 + strSREG_15).reverse().toString();
				String byte3 = new StringBuilder(strSREG_16 + strSREG_17 + strSREG_18 + strSREG_19 + strSREG_20
						+ strSREG_21 + strSREG_22 + strSREG_23).reverse().toString();
				String byte4 = new StringBuilder(strSREG_24 + strSREG_25 + strSREG_26 + strSREG_27 + strSREG_28
						+ strSREG_29 + strSREG_30 + strSREG_31).reverse().toString();
				String byte5 = new StringBuilder(strSREG_32 + strSREG_33 + strSREG_34 + strSREG_35 + strSREG_36
						+ strSREG_37 + strSREG_38 + strSREG_39).reverse().toString();
				String byte6 = new StringBuilder(strSREG_40 + strSREG_41 + strSREG_42 + strSREG_43 + strSREG_44
						+ strSREG_45 + strSREG_46 + strSREG_47).reverse().toString();
				String byte7 = new StringBuilder(strSREG_48 + strSREG_49 + strSREG_50 + strSREG_51 + strSREG_52
						+ strSREG_53 + strSREG_54 + strSREG_55).reverse().toString();
				String byte8 = new StringBuilder(strSREG_56 + strSREG_57 + strSREG_58 + strSREG_59 + strSREG_60
						+ strSREG_61 + strSREG_62 + strSREG_63).reverse().toString();
				String byte9 = new StringBuilder(strSREG_64 + strSREG_65 + strSREG_66 + strSREG_67 + strSREG_68
						+ strSREG_69 + strSREG_70 + strSREG_71).reverse().toString();
				String byte10 = new StringBuilder(strSREG_72 + strSREG_73 + strSREG_74 + strSREG_75 + strSREG_76
						+ strSREG_77 + strSREG_78 + strSREG_79).reverse().toString();
				String byte11 = new StringBuilder(strSREG_80 + strSREG_81 + strSREG_82 + strSREG_83 + strSREG_84
						+ strSREG_85 + strSREG_86 + strSREG_87).reverse().toString();
				String byte12 = new StringBuilder(strSREG_88 + strSREG_89 + strSREG_90 + strSREG_91 + strSREG_92
						+ strSREG_93 + strSREG_94 + strSREG_95).reverse().toString();
				
				String wrdDAC1 = new StringBuilder("00000" + strIVREF).toString();
				String wrdDAC2 = new StringBuilder(strBinVoltVal).toString();
				String wrdDAC3 = new StringBuilder(strChannel).toString();
				String wrdDAC4 = new StringBuilder("0000" + strCommand).toString();
				String wrdDAC5 = new StringBuilder("0000000" + strSELDAC).toString();
				
				String catWrdDAC = new StringBuilder(wrdDAC5 + wrdDAC4 + wrdDAC3 + wrdDAC2 + wrdDAC1).reverse().toString();  // no reverse or reverse?
				
				String byte13 = catWrdDAC.substring(0, 8);
				String byte14 = catWrdDAC.substring(8, 16);
				String byte15 = catWrdDAC.substring(16, 24);
				String byte16 = catWrdDAC.substring(24, 32);
				String byte17 = catWrdDAC.substring(32, 40);
				
				String byteDAC = new StringBuilder(byte13 + byte14 + byte15 + byte16).toString();
				//String byteDAC = new StringBuilder(wrdDAC1 + strBinVoltVal + strChannel + strCommand + "0000" + strSELDAC + "0000000" ).reverse().toString();  // no reverse or reverse?

				String sendBytes = new StringBuilder(byte17 + byte16 + byte15 + byte14 + byte13 + byte1 + byte2 + byte3 + byte4 + byte5 + byte6 + byte7 + byte8
						+ byte9 + byte10 + byte11 + byte12).reverse().toString();

				String catStr = startByte + sendBytes;

				binField.setText(catStr);

				String hexStr = new BigInteger(catStr, 2).toString(16);

				// int decReg = Integer.parseInt(catStr,2);
				// String hexStr = Integer.toString(decReg,16);

				hexField.setText(hexStr);
				dacWordField.setText(byteDAC);

				if (rdbtnUARTLoad.isSelected()) {

					String baudRate = baudRateField.getText();
					String uartDevice = uartDeviceField.getText();

					try {
						// String homeDir = System.getenv("HOME");
						//
						// String[] cmd = { homeDir + "/sendUART.sh", hexStr,
						// baudRate, uartDevice };
						String[] cmd = { "/media/data/git/spiregctrl/src/sendUART.sh", hexStr, baudRate, uartDevice };
						Process p = Runtime.getRuntime().exec(cmd);
					} catch (IOException ioEx) {
						ioEx.printStackTrace(); // or what ever you want to do
												// with it
					}

				}

			}

		});

	}
}
