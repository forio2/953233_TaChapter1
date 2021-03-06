package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import model.Item.Armor;
import model.Item.Weapon;

public class EquipPane extends ScrollPane {
    private Weapon equippedWeapon;
    private Armor equippedArmor;
    public EquipPane() { }
    private Pane getDetailsPane() {
        Pane equipmentInfoPane = new VBox(10);
        equipmentInfoPane.setBorder(null);
        ((VBox) equipmentInfoPane).setAlignment(Pos.CENTER);
        equipmentInfoPane.setPadding(new Insets(25, 25, 25, 25));
        Label weaponLbl,armorLbl;
        ImageView weaponImg = new ImageView();
        ImageView armorImg = new ImageView();
        if (equippedWeapon != null) {
            weaponLbl = new Label("Weapon:\n"+equippedWeapon.getName());
            weaponImg.setImage(new Image(getClass().getClassLoader().getResource(
                    equippedWeapon.getImagepath()).toString()));
        } else {
            weaponLbl = new Label("Weapon:");
            weaponImg.setImage(new Image(getClass().getClassLoader().getResource("assets/blank.png").toString()));
        }
        if (equippedArmor != null) {
            armorLbl = new Label("Armor: \n"+equippedArmor.getName());
            armorImg.setImage(new Image(getClass().getClassLoader().getResource(
                    equippedArmor.getImagepath()).toString()));
        } else {
            armorLbl = new Label("Armor:");
            armorImg.setImage(new Image(getClass().getClassLoader().getResource("assets/blank.png").toString()));
        }
        equipmentInfoPane.getChildren().addAll(weaponLbl, weaponImg, armorLbl,
                armorImg);
        return equipmentInfoPane;
    }
    public void drawPane(Weapon equippedWeapon, Armor equippedArmor) {
        this.equippedWeapon = equippedWeapon;
        this.equippedArmor = equippedArmor;
        Pane equipmentInfo = getDetailsPane();
        this.setStyle("-fx-background-color:Red;");
        this.setContent(equipmentInfo);
    } }
