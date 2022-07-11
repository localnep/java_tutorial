
import java.awt.Component;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.text.AttributedString;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;


public class ImagesTextRenderer extends JLabel implements ListCellRenderer{

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
       //Get Values
       ImagesNText isnt = (ImagesNText) value;
       
       //Set Values
        setIcon(isnt.getImg());
        setText(isnt.getName());
        
        if(isSelected){
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        }
        else{
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        setFont(list.getFont());
        
        return this;
    }  
}

//bean class
class ImagesNText{
    private Icon img;
    private String name;
    //private  AttributedString atString = new AttributedString("Example text string");
    
    public ImagesNText(Icon img,String name){
        this.img = img;
        this.name= name;
    }
    
   // Font font = new Font("LucidaSans", Font.ITALIC, 13);
    //atString.addAttribute();
    

    public Icon getImg() {
        return img;
    }

    public void setImg(Icon img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
    
    
