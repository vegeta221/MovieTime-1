package il.cshaifasweng.OCSFMediatorExample.client;

import il.cshaifasweng.OCSFMediatorExample.entities.Complaint;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ComplaintAddedPageController {
    @FXML
    private Label firstNameLabel;

    @FXML
    private Label lastNameLabel;

    @FXML
    private Label emailLabel;

    @FXML
    private Label phoneNumberLabel;

    @FXML
    private Label complaintTypeLabel;

    @FXML
    private Label orderNumberLabel;

    @FXML
    private Label complaintTitleLabel;

    @FXML
    private Label complaintDetailsLabel;

    @FXML
    void initialize() {
        assert firstNameLabel != null : "fx:id=\"firstNameLabel\" was not injected: check your FXML file 'ComplaintAddedPage.fxml'.";
        assert lastNameLabel != null : "fx:id=\"lastNameLabel\" was not injected: check your FXML file 'ComplaintAddedPage.fxml'.";
        assert emailLabel != null : "fx:id=\"emailLabel\" was not injected: check your FXML file 'ComplaintAddedPage.fxml'.";
        assert phoneNumberLabel != null : "fx:id=\"phoneNumberLabel\" was not injected: check your FXML file 'ComplaintAddedPage.fxml'.";
        assert complaintTypeLabel != null : "fx:id=\"complaintTypeLabel\" was not injected: check your FXML file 'ComplaintAddedPage.fxml'.";
        assert orderNumberLabel != null : "fx:id=\"orderNumberLabel\" was not injected: check your FXML file 'ComplaintAddedPage.fxml'.";
        assert complaintTitleLabel != null : "fx:id=\"complaintTitleLabel\" was not injected: check your FXML file 'ComplaintAddedPage.fxml'.";
        assert complaintDetailsLabel != null : "fx:id=\"complaintDetailsLabel\" was not injected: check your FXML file 'ComplaintAddedPage.fxml'.";
    }
     
    void setData(Complaint complaint) {
    	complaintDetailsLabel.setWrapText(true);
        firstNameLabel.setText(complaint.getFirstName());
        lastNameLabel.setText(complaint.getLastName());
        emailLabel.setText(complaint.getEmail());
        phoneNumberLabel.setText(complaint.getPhoneNumber());
        complaintTypeLabel.setText(complaint.getComplaintType());
        orderNumberLabel.setText(String.valueOf(complaint.getPurchase().getId()));
        complaintTitleLabel.setText(complaint.getComplaintTitle());
        complaintDetailsLabel.setText(complaint.getComplaintDetails());
    }
}
