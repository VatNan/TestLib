
import { NativeModules } from 'react-native';

const { RNTestLib } = NativeModules;

export default {
    testText: (msg) => {
        console.log("test lib")
        RNTestLib.testText(msg, (res) => {
            console.log("in cb")
            return res
        })
    }
};
// export default RNTestLib;
