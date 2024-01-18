# Driver Drowsiness Monitor
[Google ML Kit’s Face Detection API](https://developers.google.com/ml-kit/vision/face-detection) allows developers to detect faces in images and videos efficiently and accurately. It provides a broad set of capabilities including face tracking, facial feature detection (eyes, nose, mouth, etc.), facial contour detection, and even classification of certain facial expressions like smiling and opening eyes. The face detection API works on both Android and iOS and can detect multiple faces in an image, with either a still image or a live camera feed. The API is flexible and provides several options for developers to customize face detection to their needs.

We used face feature detection to build a drowsiness monitor that checks whether both right eye open and left eye open probabilities are less than 50% for 10 consecutive frames. We selected 10 consecutive frames to prevent the classification of blinking as drowsiness.

Two of the models we tested from the API for face feature detection include one that focuses on speed and another one that focuses on accuracy. Speed and accuracy are very important factors in our drowsiness monitoring. However, it is difficult to have both. Therefore, we compared the models to see which one is more power-efficient.

## Credits
- Google ML Kit
- @themobiledev
