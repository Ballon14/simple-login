# 🚀 Simple Information System

> A modern and elegant JavaFX-based information system with user authentication and admin dashboard functionality.

## 📋 Table of Contents

- [Features](#-features)
- [Screenshots](#-screenshots)
- [Prerequisites](#-prerequisites)
- [Installation](#-installation)
- [Project Structure](#-project-structure)
- [Usage](#-usage)
- [Configuration](#-configuration)
- [Development](#-development)
- [Contributing](#-contributing)
- [License](#-license)

## ✨ Features

### 🔐 **Authentication System**
- User registration with validation
- Secure login functionality
- Session management

### 👤 **User Management**
- User registration with full name and NIM
- User data storage and retrieval
- Admin view of registered users

### 📊 **Admin Dashboard**
- Modern and intuitive interface
- User data management
- System information display
- Secure logout functionality

### 🎨 **UI/UX**
- Modern gradient backgrounds
- Responsive design
- Card-based layouts
- Professional color schemes
- Smooth transitions and effects

## 📸 Screenshots

### Login Screen
- Clean and modern login interface
- Gradient background with professional styling
- Form validation and user feedback

### Registration Form
- Comprehensive user registration
- Input validation
- Consistent design language

### Admin Dashboard
- Professional admin interface
- Quick access to system functions
- Modern card-based layout

## 🔧 Prerequisites

Before running this application, make sure you have:

- **Java Development Kit (JDK) 17 or higher**
- **JavaFX SDK 24.0.1** (or compatible version)
- **Visual Studio Code** (recommended) with Java extensions
- **Scene Builder** (optional, for FXML editing)

## 🚀 Installation

### 1. Clone the Repository
```bash
git clone https://github.com/Ballon14/simple-login.git
cd simple-login
```

### 2. Download JavaFX SDK
1. Download JavaFX SDK from [OpenJFX.io](https://openjfx.io/)
2. Extract to `C:\Program Files\Java\javafx-sdk-24.0.1\` (Windows)
3. Update the path in `.vscode/launch.json` and `.vscode/settings.json` if different

### 3. Configure VS Code
The project includes pre-configured VS Code settings:
- Launch configuration for JavaFX
- Java project settings
- Referenced libraries configuration

### 4. Run the Application
```bash
# Using VS Code
Press F5 or use the "Launch JavaFX App" configuration

# Using Command Line
java --module-path "path/to/javafx/lib" --add-modules javafx.controls,javafx.fxml,javafx.graphics,javafx.base Main
```

## 📁 Project Structure

```
simple-information-system/
├── .vscode/
│   ├── launch.json          # VS Code launch configuration
│   └── settings.json        # VS Code project settings
├── src/
│   ├── Main.java           # Application entry point
│   ├── LoginController.java        # Login functionality
│   ├── RegisterController.java     # Registration functionality
│   ├── AdminDashboardController.java # Admin dashboard
│   ├── admin/
│   │   └── adminDashboard.fxml     # Admin dashboard UI
│   └── user/
│       ├── login.fxml              # Login screen UI
│       └── register.fxml           # Registration form UI
├── bin/                    # Compiled classes (auto-generated)
├── lib/                    # External libraries
└── README.md              # Project documentation
```

## 🎯 Usage

### For End Users

1. **Registration**
   - Click "Register" on login screen
   - Fill in required information (Username, Password, Full Name, NIM)
   - Click "Register" to create account

2. **Login**
   - Enter username and password
   - Click "Login" to access dashboard

3. **Dashboard**
   - View user data
   - Check system information
   - Logout when finished

### For Developers

1. **Adding New Features**
   - Create new FXML files in appropriate folders
   - Implement corresponding controller classes
   - Update navigation logic

2. **Styling**
   - Modify FXML files directly or use Scene Builder
   - Follow existing color scheme and design patterns
   - Test across different screen sizes

## ⚙️ Configuration

### JavaFX Path Configuration
Update these files if your JavaFX installation path differs:

**`.vscode/launch.json`**
```json
"vmArgs": "--module-path \"YOUR_JAVAFX_PATH\\lib\" --add-modules javafx.controls,javafx.fxml,javafx.graphics,javafx.base"
```

**`.vscode/settings.json`**
```json
"java.project.referencedLibraries": [
    "lib/**/*.jar",
    "YOUR_JAVAFX_PATH\\lib\\**/*.jar"
]
```

### Customization Options

- **Colors**: Modify gradient and color values in FXML files
- **Fonts**: Update font-size and font-weight in styles
- **Layout**: Adjust spacing, padding, and dimensions
- **Icons**: Replace emoji icons with custom graphics

## 🛠 Development

### Building from Source
```bash
# Compile Java files
javac -cp "path/to/javafx/lib/*" src/*.java -d bin/

# Run application
java -cp "bin:path/to/javafx/lib/*" --add-modules javafx.controls,javafx.fxml Main
```

### IDE Setup
- **IntelliJ IDEA**: Import as Maven/Gradle project or configure JavaFX manually
- **Eclipse**: Install JavaFX plugin and configure module path
- **VS Code**: Use provided configuration files

### Testing
- Test all user flows (registration, login, dashboard)
- Validate form inputs and error handling
- Test UI responsiveness across different window sizes

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

### Contribution Guidelines
- Follow existing code style and patterns
- Add comments for complex functionality
- Test thoroughly before submitting
- Update documentation as needed

## 🐛 Known Issues

- User data is stored in memory only (not persistent)
- Limited input validation on registration form
- No password encryption implemented

## 🔮 Future Enhancements

- [ ] Database integration for persistent storage
- [ ] Password encryption and security improvements
- [ ] User profile management
- [ ] Advanced admin features
- [ ] Export/import functionality
- [ ] Multi-language support
- [ ] Dark/light theme toggle

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**Your Name**
- GitHub: [@Ballon14](https://github.com/Ballon14)
- Email: iqbal140605@Gmail.com

## 🙏 Acknowledgments

- JavaFX community for excellent documentation
- OpenJFX team for maintaining the framework
- VS Code Java team for great development tools

---

<div align="center">

**⭐ Star this repository if you found it helpful!**

Made with ❤️ using JavaFX

</div>