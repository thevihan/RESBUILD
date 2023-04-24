import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;


public class ResumeBuilder {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Resume Builder");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Personal Information
        JLabel nameLabel = new JLabel("Full Name:");
        JTextField nameField = new JTextField();
        JLabel contactLabel = new JLabel("Contact Number:");
        JTextField contactField = new JTextField();
        JLabel emailLabel = new JLabel("Email Address:");
        JTextField emailField = new JTextField();
        JLabel addressLabel = new JLabel("Address:");
        JTextField addressField = new JTextField();

        // Education Information
        JLabel educationLabel = new JLabel("Education:");
        JLabel highestEducationLabel = new JLabel("Highest Qualification:");
        JTextField highestEducationField = new JTextField();
        JLabel institutionLabel = new JLabel("Institution Name:");
        JTextField institutionField = new JTextField();
        JLabel completionYearLabel = new JLabel("Completion Year:");
        JTextField completionYearField = new JTextField();

        // Work Experience
        JLabel workExperienceLabel = new JLabel("Work Experience:");
        JLabel yearsOfExperienceLabel = new JLabel("Years of Experience:");
        JTextField yearsOfExperienceField = new JTextField();
        JLabel jobTitleLabel = new JLabel("Job Title:");
        JTextField jobTitleField = new JTextField();
        JLabel companyNameLabel = new JLabel("Company Name:");
        JTextField companyNameField = new JTextField();

        // Add components to the panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(contactLabel);
        panel.add(contactField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(addressLabel);
        panel.add(addressField);
        panel.add(educationLabel);
        panel.add(highestEducationLabel);
        panel.add(highestEducationField);
        panel.add(institutionLabel);
        panel.add(institutionField);
        panel.add(completionYearLabel);
        panel.add(completionYearField);
        panel.add(workExperienceLabel);
        panel.add(yearsOfExperienceLabel);
        panel.add(yearsOfExperienceField);
        panel.add(jobTitleLabel);
        panel.add(jobTitleField);
        panel.add(companyNameLabel);
        panel.add(companyNameField);

        // Create a button to generate the resume
        JButton generateButton = new JButton("Generate Resume");
        generateButton.addActionListener(e -> {
            // Retrieve user input from text fields
            String fullName = nameField.getText();
            String contactNumber = contactField.getText();
            String emailAddress = emailField.getText();
            String address = addressField.getText();
            String highestEducation = highestEducationField.getText();
            String institutionName = institutionField.getText();
            String completionYear = completionYearField.getText();
            String workExperience = yearsOfExperienceField.getText();
            String jobTitle = jobTitleField.getText();
            String companyName = companyNameField.getText();
            String resupreview = "<html>"
                    + "<head>"
                    + "<style>"
                    + "body { font-family: Arial, sans-serif; }"
                    + "h1 { text-align: center; }"
                    + "h2 { margin-top: 20px; }"
                    + "p { margin-top: 10px; }"
                    + "</style>"
                    + "</head>"
                    + "<body>"
                    + "<h1>RESUME</h1>"
                    + "<h2>PERSONAL INFORMATION</h2>"
                    + "<p>Full Name: " + fullName + "</p>"
                    + "<p>Contact Number: " + contactNumber + "</p>"
                    + "<p>Email Address: " + emailAddress + "</p>"
                    + "<p>Address: " + address + "</p>"
                    + "<h2>EDUCATION</h2>"
                    + "<p>Highest Education: " + highestEducation + "</p>"
                    + "<p>Institution Name: " + institutionName + "</p>"
                    + "<p>Completion Year: " + completionYear + "</p>"
                    + "<h2>WORK EXPERIENCE</h2>"
                    + "<p>Years of Experience: " + workExperience + "</p>"
                    + "<p>Job Title: " + jobTitle + "</p>"
                    + "<p>Company Name: " + companyName + "</p>"
                    + "</body>"
                    + "</html>";

            String htmlCode = "<html><head><title>Resume</title><style>*{box-sizing:border-box;margin:0;padding:0}body{font-family:Arial,sans-serif;background-color:#f2f2f2;color:#333;line-height:1.5;padding:20px}.container{max-width:794px;margin:0 auto;background-color:#fff;box-shadow:0 0 10px rgba(0,0,0,0.1);padding:40px;position:relative;animation:fade-in 0.5s ease-out;-webkit-animation:fade-in 0.5s ease-out}@keyframes fade-in{from{opacity:0}to{opacity:1}}@-webkit-keyframes fade-in{from{opacity:0}to{opacity:1}}h1{text-align:center;margin-bottom:20px;color:#2c3e50;animation:slide-in 0.5s ease-out;-webkit-animation:slide-in 0.5s ease-out}@keyframes slide-in{from{transform:translateY(-50px);opacity:0}to{transform:translateY(0);opacity:1}}@-webkit-keyframes slide-in{from{-webkit-transform:translateY(-50px);opacity:0}to{-webkit-transform:translateY(0);opacity:1}}h2{margin-top:30px;color:#2980b9;animation:fade-in 0.5s ease-out;-webkit-animation:fade-in 0.5s ease-out}p{margin:10px 0}.resume-item{margin-bottom:30px;animation:slide-in 0.5s ease-out;-webkit-animation:slide-in 0.5s ease-out}.resume-item:hover{box-shadow:0 0 10px rgba(0,0,0,0.2);transition:box-shadow 0.3s ease}</style></head></html>";

            String resumeHtml = "<body>" +
                                "  <div class=\"container\">" +
                                "    <div class=\"header\">" +
                                "      <h1>RESUME</h1>" +
                                "    </div>" +
                                "    <div class=\"personal-information section\">" +
                                "      <h2>PERSONAL INFORMATION</h2>" +
                                "      <div class=\"row\">" +
                                "        <div class=\"col\">" +
                                "          <p>Full Name:</p>" +
                                "          <h3>%s</h3>" +
                                "        </div>" +
                                "        <div class=\"col\">" +
                                "          <p>Contact Number:</p>" +
                                "          <h3>%s</h3>" +
                                "        </div>" +
                                "        <div class=\"col\">" +
                                "          <p>Email Address:</p>" +
                                "          <h3>%s</h3>" +
                                "        </div>" +
                                "        <div class=\"col\">" +
                                "          <p>Address:</p>" +
                                "          <h3>%s</h3>" +
                                "        </div>" +
                                "      </div>" +
                                "    </div>" +
                                "    <div class=\"education section\">" +
                                "      <h2>EDUCATION</h2>" +
                                "      <div class=\"row\">" +
                                "        <div class=\"col\">" +
                                "          <p>Highest Education:</p>" +
                                "          <h3>%s</h3>" +
                                "        </div>" +
                                "        <div class=\"col\">" +
                                "          <p>Institution Name:</p>" +
                                "          <h3>%s</h3>" +
                                "        </div>" +
                                "        <div class=\"col\">" +
                                "          <p>Completion Year:</p>" +
                                "          <h3>%s</h3>" +
                                "        </div>" +
                                "      </div>" +
                                "    </div>" +
                                "    <div class=\"work-experience section\">" +
                                "      <h2>WORK EXPERIENCE</h2>" +
                                "      <div class=\"row\">" +
                                "        <div class=\"col\">" +
                                "          <p>Years of Experience:</p>" +
                                "          <h3>%s</h3>" +
                                "        </div>" +
                                "        <div class=\"col\">" +
                                "          <p>Job Title:</p>" +
                                "          <h3>%s</h3>" +
                                "        </div>" +
                                "        <div class=\"col\">" +
                                "          <p>Company Name:</p>" +
                                "          <h3>%s</h3>" +
                                "        </div>" +
                                "      </div>" +
                                "    </div>" +
                                "  </div>" +
                                "</body>";
            resumeHtml = String.format(resumeHtml, fullName, contactNumber, emailAddress, address, highestEducation, institutionName, completionYear, workExperience, jobTitle, companyName);
            String resumeOutput = htmlCode+""+resumeHtml;

            // Create a dialog box to display the generated resume
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(resumeOutput);
                    String fileName = "RESUMEREBUILD.html"; // Change the file name as desired
                    try (FileWriter fileWriter = new FileWriter(fileName)) {
                        fileWriter.write(stringBuilder.toString());
                        fileWriter.flush();
                        System.out.println("Resume saved as " + fileName);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

            JOptionPane.showMessageDialog(null, resupreview, "Generated Resume", JOptionPane.INFORMATION_MESSAGE);
        });


        // Add the generate button to the panel
        panel.add(generateButton);

        // Add the panel to the frame
        frame.add(panel);

        // Set the frame visible
        frame.setVisible(true);
    }
}

