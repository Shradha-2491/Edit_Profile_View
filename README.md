# Edit_Profile_View
Android App Development using Android Studio Project for The Swastika. It is edit profile view.

## To start with this project first is need to add dependencies in gradle build.

    implementation 'androidx.appcompat:appcompat:1.3.1'
    implementation 'com.google.android.material:material:1.4.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.1'
    testImplementation 'junit:junit:4.+'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
    api 'com.theartofdev.edmodo:android-image-cropper:2.8.+'
    implementation 'com.squareup.picasso:picasso:2.5.2'
    
## And then add few lines in AndroidManifest
    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
    <uses-permission android:name="android.permission.CAMERA"/>
    
    and 
    
    <activity android:name="com.theartofdev.edmodo.cropper.CropImageActivity"
            android:theme="@style/Base.Theme.AppCompat"/>
            
# This application need two activities:-
    MainActivity
    ChangePasswordActivity
