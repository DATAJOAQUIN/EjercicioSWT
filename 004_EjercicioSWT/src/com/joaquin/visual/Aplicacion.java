package com.joaquin.visual;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class Aplicacion {
	private static Text text;
	private static Text text_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(727, 435);
		shell.setText("SWT Application");
		shell.setLayout(new FillLayout(SWT.VERTICAL));
		
		Composite composite = new Composite(shell, SWT.NONE);
		
		Label lblUnidades = new Label(composite, SWT.NONE);
		lblUnidades.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblUnidades.setBounds(188, 30, 84, 30);
		lblUnidades.setText("Unidades");
		
		text = new Text(composite, SWT.BORDER);
		text.setBounds(380, 33, 126, 30);
		
		Composite composite_1 = new Composite(shell, SWT.NONE);
		
		Label lblPrecio = new Label(composite_1, SWT.NONE);
		lblPrecio.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblPrecio.setBounds(189, 38, 64, 30);
		lblPrecio.setText("Precio");
		
		text_1 = new Text(composite_1, SWT.BORDER);
		text_1.setBounds(379, 41, 132, 30);
		
		Composite composite_2 = new Composite(shell, SWT.NONE);
		
		Button btnNewButton = new Button(composite_2, SWT.NONE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
			}
		});
		
		Composite composite_3 = new Composite(shell, SWT.NONE);
		
		Label lbResultado = new Label(composite_3, SWT.NONE);
		lbResultado.setAlignment(SWT.CENTER);
		lbResultado.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		lbResultado.setBounds(278, 33, 171, 39);
		lbResultado.setText("New Label");
		
		btnNewButton.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int unidades=Integer.parseInt(text.getText());
				float precio=Float.parseFloat(text_1.getText());
				
				float resultado=unidades*precio;
				
				
				
				lbResultado.setText(String.valueOf(resultado));
			
			}
		});
		btnNewButton.setBounds(292, 34, 113, 39);
		btnNewButton.setText("Calcular");
		


		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
