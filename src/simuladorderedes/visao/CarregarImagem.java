package simuladorderedes.visao;

import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class CarregarImagem extends JComponent implements MouseMotionListener{

  static int imagemLargura = 60, imagemAltura = 60;

    public static int getImagemLargura() {
        return imagemLargura;
    }

    public static int getImagemAltura() {
        return imagemAltura;
    }
  int imageX, imageY;

  Image image;
  
  public CarregarImagem(Image image) {
    this.image = image;
    addMouseMotionListener(this);
  }

  @Override
  public void mouseDragged(MouseEvent e) {
    imageX = e.getX();
    imageY = e.getY();
    repaint();
  }

  @Override
  public void mouseMoved(MouseEvent e) {
  }

  @Override
  public void paint(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    g2.drawImage(image, imageX, imageY, this);
  }
}
