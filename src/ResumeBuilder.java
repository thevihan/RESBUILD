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

//            // Generate the resume output
//            String resumeOutput = "PERSONAL INFORMATION:\n"
//                    + "Full Name: " + fullName + "\n"
//                    + "Contact Number: " + contactNumber + "\n"
//                    + "Email Address: " + emailAddress + "\n"
//                    + "Address: " + address + "\n\n"
//                    + "EDUCATION:\n"
//                    + "Highest Education: " + highestEducation + "\n"
//                    + "Institution Name: " + institutionName + "\n"
//                    + "Completion Year: " + completionYear + "\n\n"
//                    + "WORK EXPERIENCE:\n"
//                    + "Years of Experience: " + workExperience + "\n"
//                    + "Job Title: "                    + jobTitle + "\n"
//                    + "Company Name: " + companyName;
// Generate the resume output
// Generate the resume output
//            StringBuilder resumeOutput = new StringBuilder();
//            resumeOutput.append("**************************************\n");
//            resumeOutput.append("*             RESUME                 *\n");
//            resumeOutput.append("**************************************\n\n");
//            resumeOutput.append("PERSONAL INFORMATION:\n");
//            resumeOutput.append("Full Name: " + fullName + "\n");
//            resumeOutput.append("Contact Number: " + contactNumber + "\n");
//            resumeOutput.append("Email Address: " + emailAddress + "\n");
//            resumeOutput.append("Address: " + address + "\n\n");
//            resumeOutput.append("EDUCATION:\n");
//            resumeOutput.append("Highest Education: " + highestEducation + "\n");
//            resumeOutput.append("Institution Name: " + institutionName + "\n");
//            resumeOutput.append("Completion Year: " + completionYear + "\n\n");
//            resumeOutput.append("WORK EXPERIENCE:\n");
//            resumeOutput.append("Years of Experience: " + workExperience + "\n");
//            resumeOutput.append("Job Title: " + jobTitle + "\n");
//            resumeOutput.append("Company Name: " + companyName + "\n");
            // Generate the resume output as an HTML string
            String resumeOutput = "<html>"
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



            // Create a dialog box to display the generated resume
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(resumeOutput);
                    String fileName = "resum.html"; // Change the file name as desired
                    try (FileWriter fileWriter = new FileWriter(fileName)) {
                        fileWriter.write(stringBuilder.toString());
                        fileWriter.flush();
                        System.out.println("Resume saved as " + fileName);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

            JOptionPane.showMessageDialog(null, resumeOutput, "Generated Resume", JOptionPane.INFORMATION_MESSAGE);
        });


        // Add the generate button to the panel
        panel.add(generateButton);

        // Add the panel to the frame
        frame.add(panel);

        // Set the frame visible
        frame.setVisible(true);
    }
}

