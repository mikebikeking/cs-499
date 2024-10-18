# cs-499 Computer Science Capstone
My name is Michael King and I am finishing my Bachelor's of Computer Science. I have thoroughly introduced myself via my Professional Self-Assessment. My Capstone course allowed me to apply my SNHU knowledge to more complex projects, demonstrating my growing skills.

**Professional Self-Assessment**

**Introduction**

After a successful two-decade career as a professional bicycle mechanic, I decided to pursue my passion for computers and enrolled in a computer science program. This self-assessment aims to evaluate my technical skills, soft skills, and career goals as I transition into the tech industry, with a particular focus on cybersecurity.

**Technical Skills**

While my background in bicycle mechanics has provided me with valuable problem-solving and hands-on skills, my recent studies have equipped me with a strong foundation in programming languages. I have gained proficiency in Java, Python, SQL, and C++, which are essential tools for software development.

**Soft Skills**

Time management has been a challenge for me, especially while balancing my full-time job, marriage, and studies. However, I have developed strategies to prioritize tasks and effectively manage my time. I believe that my experience in the bicycle repair industry has honed my communication skills, as I often interacted with customers to understand their needs and provide clear explanations. Additionally, my ability to adapt to changing situations and work under pressure has been invaluable in both my previous and current roles.

**Key Interests and Certifications**

I have developed a strong interest in cybersecurity and am actively seeking and obtaining IBM certifications in this field. These certifications will validate my knowledge and skills in cybersecurity best practices, risk management, and incident response.

**Career Goals**

My goal is to leverage my technical skills, soft skills, and cybersecurity expertise to secure a challenging and fulfilling role in the tech industry. I am eager to apply my knowledge and experience to contribute to innovative projects and collaborate with talented professionals. I am particularly interested in exploring opportunities in cybersecurity engineering, threat intelligence, or incident response.

**Conclusion**

This self-assessment has allowed me to reflect on my professional journey and identify my strengths and areas for development. I am confident in my ability to succeed in the tech industry, particularly in the field of cybersecurity. I am excited about the opportunities that lie ahead and am committed to continuous learning and professional growth.



**Code Review of Original Project**

**AndroidManifest.xml**

The AndroidManifest.xml file is in good condition. I believe it correctly defines the application's basic information, including the main activity.

**activity_main.xml**

The layout in activity_main.xml could be improved. It uses absolute positioning, which is not ideal for flexibility and responsiveness. I will change to use ConstraintLayout properties for a better layout. The current layout only displays a welcome message, login fields, and buttons, so it might need more elements to represent the full functionality of the login screen.

**inventory.xml**

The inventory.xml layout also has similar issues with absolute positioning. The TableRow elements within the layout have IDs but lack content, making their purpose unclear. The buttons ("Add", "Scan", "Remove") also need more context to understand their functionality.

**sms_notifications.xml**

The sms_notifications.xml layout also uses absolute positioning and has elements with missing constraints. The layout includes an unnecessary EditText element with the text "SMS Notifications."

**Recommendations**

To improve the code, I will be using ConstraintLayout properties for a more flexible layout, reviewing design principles for better aesthetics, using descriptive IDs and text, and ensuring the layout reflects the intended functionality of each screen. Additionally, using a linter tool can help identify potential issues in the code.

<img width="571" alt="Screenshot 2024-10-18 170534" src="https://github.com/user-attachments/assets/0409f420-e061-4dfe-b0fa-acfcc3491734">





