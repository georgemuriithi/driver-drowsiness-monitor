# Driver Drowsiness Monitor
[Google ML Kit’s Face Detection API](https://developers.google.com/ml-kit/vision/face-detection) allows developers to detect faces in images and videos efficiently and accurately. It provides a broad set of capabilities including face tracking, facial feature detection (eyes, nose, mouth, etc.), facial contour detection, and even classification for certain features like smiling and eyes open. The face detection API works on both Android and iOS and can detect multiple faces in an image, with either a still image or a live camera feed. The API is flexible and provides several options for developers to customize face detection to their needs.

We used face feature detection to build a drowsiness detector that checks whether both right eye open probability and left eye open probability are less than 50% for 10 consecutive frames. We selected 10 consecutive frames to prevent the classification of blinking as drowsiness.

Two of the models we tested from the API for face feature detection include one that focuses on speed and another one that focuses on accuracy. Speed and accuracy are very important factors in our drowsiness detection. However, we cannot have both. Therefore, we compared the modes to see which one is more power-efficient.

## Credits
- Google ML Kit
- @themobiledev
