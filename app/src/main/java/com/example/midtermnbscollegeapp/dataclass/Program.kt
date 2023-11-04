package com.example.midtermnbscollegeapp.dataclass

data class Program (
    val name: String,
    val description: String,
    val career: String
)

val programList = listOf(
    Program(
        name = "Bachelor of Science in Accountancy",
        description = "Design to equip aspiring accountants with fundamental skills in general accounting, this program shapes the students to become anlytical, logical, and detailed-oriented profesionals in the business field. BSA graduates can further pursue a professional carrer in accountancy by taking the licensure exam to become Certified Public Accountant",
        career = "Chief Financial Officer, Financial Analyst, Financial Advisor, Tax Accountant, Auditor,Accounting Professor"
    ),
    Program(
        name = "Bachelor of Science in Accounting Information System",
        description = "As a specialized degree, the BSAIS program combines knowledge in business, accounting, and computer systems to help make the accounting processes more efficient with the help of information technology. BSAIS graduates can pursue any career options in accountancy with focus on IT support and are qualified to take assessments leading to certifications in Accounting Information Systems.",
        career = "Chief Financial Officer\n" +
                "Financial Advisor\n" +
                "Audit Services Manager\n" +
                "Senior Consulting Manager\n" +
                "Senior Information Systems Auditor Financial Advisor\n" +
                "Financial Advisor"
    ),
    Program(
        name = "Bachelor of Science in Entrepreneurship",
        description = "Conquer the business world with the Bachelor of Science in Entrepreneurship (BSE) program. This program aims to teach aspiring entrepreneurs in starting and managing a business, identifying business opportunities, and employing entrepreneurial skills necessary to keep the business running. BSE graduates can choose whether to start a small enterprise or pursue employment opportunities in an established business. ",
        career = "Entrepreneur\n" +
                "Chief Executive Officer\n" +
                "Business Manager\n" +
                "Operations Director\n" +
                "Business Development Head\n" +
                "Management Analyst"
    ),
    Program(
        name = "Bachelor of Science in Tourism Management",
        description = "Become a world-class tourism professional with the Bachelor of Science in Tourism Management (BSTM) program. This program touches on business, hospitality, and service-oriented aspects of travel and tourism. With tourism being one of the fastest growing sectors both locally and internationally, BSTM graduates can look forward to thriving business opportunities in the tourism industry.",
        career = "Tourism Center Director\n" +
                "Urban & Regional Planning Consultant\n" +
                "Tour Operator\n" +
                "Product Development Director\n" +
                "Event Specialist\n" +
                "Flight Attendant\n" +
                "Public Relations Manager"
    ),
    Program(
        name = "Bachelor of Science in Computer Science",
        description = "Master the language of technology with the Bachelor of Science in Computer Science (BSCS) program. This program prepares you in designing, writing, and developing algorithmically complex software and hardware designed to perform specific tasks and solve complicated problems. BSCS graduates can look forward to lucrative career options in this technology-driven world.",
        career = "Data Security Analyst\n" +
                "Applications Architect\n" +
                "Software Engineer\n" +
                "Mobile Applications Developer\n" +
                "Network Security Administrator\n" +
                "Research & Devt. Research\n" +
                "Professional"
    )

)